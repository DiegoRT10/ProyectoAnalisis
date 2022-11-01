/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.IllegalOrphanException;
import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import cunori.kardex.dao.LibroVenta;
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
public class VentaJpaController implements Serializable {

    public VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Venta venta) throws PreexistingEntityException, Exception {
        if (venta.getLibroVentaCollection() == null) {
            venta.setLibroVentaCollection(new ArrayList<LibroVenta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<LibroVenta> attachedLibroVentaCollection = new ArrayList<LibroVenta>();
            for (LibroVenta libroVentaCollectionLibroVentaToAttach : venta.getLibroVentaCollection()) {
                libroVentaCollectionLibroVentaToAttach = em.getReference(libroVentaCollectionLibroVentaToAttach.getClass(), libroVentaCollectionLibroVentaToAttach.getId());
                attachedLibroVentaCollection.add(libroVentaCollectionLibroVentaToAttach);
            }
            venta.setLibroVentaCollection(attachedLibroVentaCollection);
            em.persist(venta);
            for (LibroVenta libroVentaCollectionLibroVenta : venta.getLibroVentaCollection()) {
                Venta oldIdVentaOfLibroVentaCollectionLibroVenta = libroVentaCollectionLibroVenta.getIdVenta();
                libroVentaCollectionLibroVenta.setIdVenta(venta);
                libroVentaCollectionLibroVenta = em.merge(libroVentaCollectionLibroVenta);
                if (oldIdVentaOfLibroVentaCollectionLibroVenta != null) {
                    oldIdVentaOfLibroVentaCollectionLibroVenta.getLibroVentaCollection().remove(libroVentaCollectionLibroVenta);
                    oldIdVentaOfLibroVentaCollectionLibroVenta = em.merge(oldIdVentaOfLibroVentaCollectionLibroVenta);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVenta(venta.getId()) != null) {
                throw new PreexistingEntityException("Venta " + venta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Venta venta) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta persistentVenta = em.find(Venta.class, venta.getId());
            Collection<LibroVenta> libroVentaCollectionOld = persistentVenta.getLibroVentaCollection();
            Collection<LibroVenta> libroVentaCollectionNew = venta.getLibroVentaCollection();
            List<String> illegalOrphanMessages = null;
            for (LibroVenta libroVentaCollectionOldLibroVenta : libroVentaCollectionOld) {
                if (!libroVentaCollectionNew.contains(libroVentaCollectionOldLibroVenta)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain LibroVenta " + libroVentaCollectionOldLibroVenta + " since its idVenta field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<LibroVenta> attachedLibroVentaCollectionNew = new ArrayList<LibroVenta>();
            for (LibroVenta libroVentaCollectionNewLibroVentaToAttach : libroVentaCollectionNew) {
                libroVentaCollectionNewLibroVentaToAttach = em.getReference(libroVentaCollectionNewLibroVentaToAttach.getClass(), libroVentaCollectionNewLibroVentaToAttach.getId());
                attachedLibroVentaCollectionNew.add(libroVentaCollectionNewLibroVentaToAttach);
            }
            libroVentaCollectionNew = attachedLibroVentaCollectionNew;
            venta.setLibroVentaCollection(libroVentaCollectionNew);
            venta = em.merge(venta);
            for (LibroVenta libroVentaCollectionNewLibroVenta : libroVentaCollectionNew) {
                if (!libroVentaCollectionOld.contains(libroVentaCollectionNewLibroVenta)) {
                    Venta oldIdVentaOfLibroVentaCollectionNewLibroVenta = libroVentaCollectionNewLibroVenta.getIdVenta();
                    libroVentaCollectionNewLibroVenta.setIdVenta(venta);
                    libroVentaCollectionNewLibroVenta = em.merge(libroVentaCollectionNewLibroVenta);
                    if (oldIdVentaOfLibroVentaCollectionNewLibroVenta != null && !oldIdVentaOfLibroVentaCollectionNewLibroVenta.equals(venta)) {
                        oldIdVentaOfLibroVentaCollectionNewLibroVenta.getLibroVentaCollection().remove(libroVentaCollectionNewLibroVenta);
                        oldIdVentaOfLibroVentaCollectionNewLibroVenta = em.merge(oldIdVentaOfLibroVentaCollectionNewLibroVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = venta.getId();
                if (findVenta(id) == null) {
                    throw new NonexistentEntityException("The venta with id " + id + " no longer exists.");
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
            Venta venta;
            try {
                venta = em.getReference(Venta.class, id);
                venta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The venta with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<LibroVenta> libroVentaCollectionOrphanCheck = venta.getLibroVentaCollection();
            for (LibroVenta libroVentaCollectionOrphanCheckLibroVenta : libroVentaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Venta (" + venta + ") cannot be destroyed since the LibroVenta " + libroVentaCollectionOrphanCheckLibroVenta + " in its libroVentaCollection field has a non-nullable idVenta field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Venta> findVentaEntities() {
        return findVentaEntities(true, -1, -1);
    }

    public List<Venta> findVentaEntities(int maxResults, int firstResult) {
        return findVentaEntities(false, maxResults, firstResult);
    }

    private List<Venta> findVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Venta.class));
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

    public Venta findVenta(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Venta> rt = cq.from(Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
