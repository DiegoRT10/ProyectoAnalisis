/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import cunori.kardex.dao.Compra;
import cunori.kardex.dao.Proveedor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class ProveedorJpaController implements Serializable {

    public ProveedorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Proveedor proveedor) throws PreexistingEntityException, Exception {
        if (proveedor.getCompraCollection() == null) {
            proveedor.setCompraCollection(new ArrayList<Compra>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Compra> attachedCompraCollection = new ArrayList<Compra>();
            for (Compra compraCollectionCompraToAttach : proveedor.getCompraCollection()) {
                compraCollectionCompraToAttach = em.getReference(compraCollectionCompraToAttach.getClass(), compraCollectionCompraToAttach.getId());
                attachedCompraCollection.add(compraCollectionCompraToAttach);
            }
            proveedor.setCompraCollection(attachedCompraCollection);
            em.persist(proveedor);
            for (Compra compraCollectionCompra : proveedor.getCompraCollection()) {
                Proveedor oldProveedorOfCompraCollectionCompra = compraCollectionCompra.getProveedor();
                compraCollectionCompra.setProveedor(proveedor);
                compraCollectionCompra = em.merge(compraCollectionCompra);
                if (oldProveedorOfCompraCollectionCompra != null) {
                    oldProveedorOfCompraCollectionCompra.getCompraCollection().remove(compraCollectionCompra);
                    oldProveedorOfCompraCollectionCompra = em.merge(oldProveedorOfCompraCollectionCompra);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProveedor(proveedor.getId()) != null) {
                throw new PreexistingEntityException("Proveedor " + proveedor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Proveedor proveedor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proveedor persistentProveedor = em.find(Proveedor.class, proveedor.getId());
            Collection<Compra> compraCollectionOld = persistentProveedor.getCompraCollection();
            Collection<Compra> compraCollectionNew = proveedor.getCompraCollection();
            Collection<Compra> attachedCompraCollectionNew = new ArrayList<Compra>();
            for (Compra compraCollectionNewCompraToAttach : compraCollectionNew) {
                compraCollectionNewCompraToAttach = em.getReference(compraCollectionNewCompraToAttach.getClass(), compraCollectionNewCompraToAttach.getId());
                attachedCompraCollectionNew.add(compraCollectionNewCompraToAttach);
            }
            compraCollectionNew = attachedCompraCollectionNew;
            proveedor.setCompraCollection(compraCollectionNew);
            proveedor = em.merge(proveedor);
            for (Compra compraCollectionOldCompra : compraCollectionOld) {
                if (!compraCollectionNew.contains(compraCollectionOldCompra)) {
                    compraCollectionOldCompra.setProveedor(null);
                    compraCollectionOldCompra = em.merge(compraCollectionOldCompra);
                }
            }
            for (Compra compraCollectionNewCompra : compraCollectionNew) {
                if (!compraCollectionOld.contains(compraCollectionNewCompra)) {
                    Proveedor oldProveedorOfCompraCollectionNewCompra = compraCollectionNewCompra.getProveedor();
                    compraCollectionNewCompra.setProveedor(proveedor);
                    compraCollectionNewCompra = em.merge(compraCollectionNewCompra);
                    if (oldProveedorOfCompraCollectionNewCompra != null && !oldProveedorOfCompraCollectionNewCompra.equals(proveedor)) {
                        oldProveedorOfCompraCollectionNewCompra.getCompraCollection().remove(compraCollectionNewCompra);
                        oldProveedorOfCompraCollectionNewCompra = em.merge(oldProveedorOfCompraCollectionNewCompra);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = proveedor.getId();
                if (findProveedor(id) == null) {
                    throw new NonexistentEntityException("The proveedor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proveedor proveedor;
            try {
                proveedor = em.getReference(Proveedor.class, id);
                proveedor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The proveedor with id " + id + " no longer exists.", enfe);
            }
            Collection<Compra> compraCollection = proveedor.getCompraCollection();
            for (Compra compraCollectionCompra : compraCollection) {
                compraCollectionCompra.setProveedor(null);
                compraCollectionCompra = em.merge(compraCollectionCompra);
            }
            em.remove(proveedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Proveedor> findProveedorEntities() {
        return findProveedorEntities(true, -1, -1);
    }

    public List<Proveedor> findProveedorEntities(int maxResults, int firstResult) {
        return findProveedorEntities(false, maxResults, firstResult);
    }

    private List<Proveedor> findProveedorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Proveedor.class));
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

    public Proveedor findProveedor(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Proveedor.class, id);
        } finally {
            em.close();
        }
    }

    public int getProveedorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Proveedor> rt = cq.from(Proveedor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
