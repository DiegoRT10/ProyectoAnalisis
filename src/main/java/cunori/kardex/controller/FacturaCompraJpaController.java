/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import cunori.kardex.dao.FacturaCompra;
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
public class FacturaCompraJpaController implements Serializable {

    public FacturaCompraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(FacturaCompra facturaCompra) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(facturaCompra);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findFacturaCompra(facturaCompra.getNoSerie()) != null) {
                throw new PreexistingEntityException("FacturaCompra " + facturaCompra + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(FacturaCompra facturaCompra) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            facturaCompra = em.merge(facturaCompra);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = facturaCompra.getNoSerie();
                if (findFacturaCompra(id) == null) {
                    throw new NonexistentEntityException("The facturaCompra with id " + id + " no longer exists.");
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
            FacturaCompra facturaCompra;
            try {
                facturaCompra = em.getReference(FacturaCompra.class, id);
                facturaCompra.getNoSerie();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The facturaCompra with id " + id + " no longer exists.", enfe);
            }
            em.remove(facturaCompra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<FacturaCompra> findFacturaCompraEntities() {
        return findFacturaCompraEntities(true, -1, -1);
    }

    public List<FacturaCompra> findFacturaCompraEntities(int maxResults, int firstResult) {
        return findFacturaCompraEntities(false, maxResults, firstResult);
    }

    private List<FacturaCompra> findFacturaCompraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(FacturaCompra.class));
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

    public FacturaCompra findFacturaCompra(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(FacturaCompra.class, id);
        } finally {
            em.close();
        }
    }

    public int getFacturaCompraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<FacturaCompra> rt = cq.from(FacturaCompra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
