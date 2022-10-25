/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.IllegalOrphanException;
import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import cunori.kardex.dao.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import cunori.kardex.dao.Venta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) throws PreexistingEntityException, Exception {
        if (cliente.getVentaCollection() == null) {
            cliente.setVentaCollection(new ArrayList<Venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Venta> attachedVentaCollection = new ArrayList<Venta>();
            for (Venta ventaCollectionVentaToAttach : cliente.getVentaCollection()) {
                ventaCollectionVentaToAttach = em.getReference(ventaCollectionVentaToAttach.getClass(), ventaCollectionVentaToAttach.getId());
                attachedVentaCollection.add(ventaCollectionVentaToAttach);
            }
            cliente.setVentaCollection(attachedVentaCollection);
            em.persist(cliente);
            for (Venta ventaCollectionVenta : cliente.getVentaCollection()) {
                Cliente oldClienteOfVentaCollectionVenta = ventaCollectionVenta.getCliente();
                ventaCollectionVenta.setCliente(cliente);
                ventaCollectionVenta = em.merge(ventaCollectionVenta);
                if (oldClienteOfVentaCollectionVenta != null) {
                    oldClienteOfVentaCollectionVenta.getVentaCollection().remove(ventaCollectionVenta);
                    oldClienteOfVentaCollectionVenta = em.merge(oldClienteOfVentaCollectionVenta);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCliente(cliente.getId()) != null) {
                throw new PreexistingEntityException("Cliente " + cliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            Collection<Venta> ventaCollectionOld = persistentCliente.getVentaCollection();
            Collection<Venta> ventaCollectionNew = cliente.getVentaCollection();
            List<String> illegalOrphanMessages = null;
            for (Venta ventaCollectionOldVenta : ventaCollectionOld) {
                if (!ventaCollectionNew.contains(ventaCollectionOldVenta)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Venta " + ventaCollectionOldVenta + " since its cliente field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Venta> attachedVentaCollectionNew = new ArrayList<Venta>();
            for (Venta ventaCollectionNewVentaToAttach : ventaCollectionNew) {
                ventaCollectionNewVentaToAttach = em.getReference(ventaCollectionNewVentaToAttach.getClass(), ventaCollectionNewVentaToAttach.getId());
                attachedVentaCollectionNew.add(ventaCollectionNewVentaToAttach);
            }
            ventaCollectionNew = attachedVentaCollectionNew;
            cliente.setVentaCollection(ventaCollectionNew);
            cliente = em.merge(cliente);
            for (Venta ventaCollectionNewVenta : ventaCollectionNew) {
                if (!ventaCollectionOld.contains(ventaCollectionNewVenta)) {
                    Cliente oldClienteOfVentaCollectionNewVenta = ventaCollectionNewVenta.getCliente();
                    ventaCollectionNewVenta.setCliente(cliente);
                    ventaCollectionNewVenta = em.merge(ventaCollectionNewVenta);
                    if (oldClienteOfVentaCollectionNewVenta != null && !oldClienteOfVentaCollectionNewVenta.equals(cliente)) {
                        oldClienteOfVentaCollectionNewVenta.getVentaCollection().remove(ventaCollectionNewVenta);
                        oldClienteOfVentaCollectionNewVenta = em.merge(oldClienteOfVentaCollectionNewVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Venta> ventaCollectionOrphanCheck = cliente.getVentaCollection();
            for (Venta ventaCollectionOrphanCheckVenta : ventaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Cliente (" + cliente + ") cannot be destroyed since the Venta " + ventaCollectionOrphanCheckVenta + " in its ventaCollection field has a non-nullable cliente field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
