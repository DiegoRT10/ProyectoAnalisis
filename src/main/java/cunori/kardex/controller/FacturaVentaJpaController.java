/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import cunori.kardex.dao.FacturaVenta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Diego Ramos
 */
public class FacturaVentaJpaController implements Serializable {

    public FacturaVentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(FacturaVenta facturaVenta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(facturaVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findFacturaVenta(facturaVenta.getNoSerie()) != null) {
                throw new PreexistingEntityException("FacturaVenta " + facturaVenta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(FacturaVenta facturaVenta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            facturaVenta = em.merge(facturaVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = facturaVenta.getNoSerie();
                if (findFacturaVenta(id) == null) {
                    throw new NonexistentEntityException("The facturaVenta with id " + id + " no longer exists.");
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
            FacturaVenta facturaVenta;
            try {
                facturaVenta = em.getReference(FacturaVenta.class, id);
                facturaVenta.getNoSerie();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The facturaVenta with id " + id + " no longer exists.", enfe);
            }
            em.remove(facturaVenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<FacturaVenta> findFacturaVentaEntities() {
        return findFacturaVentaEntities(true, -1, -1);
    }

    public List<FacturaVenta> findFacturaVentaEntities(int maxResults, int firstResult) {
        return findFacturaVentaEntities(false, maxResults, firstResult);
    }

    private List<FacturaVenta> findFacturaVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(FacturaVenta.class));
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

    public FacturaVenta findFacturaVenta(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(FacturaVenta.class, id);
        } finally {
            em.close();
        }
    }

    public int getFacturaVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<FacturaVenta> rt = cq.from(FacturaVenta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
