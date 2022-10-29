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
import cunori.kardex.dao.DetalleCompra;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class DetalleCompraJpaController implements Serializable {

    public DetalleCompraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleCompra detalleCompra) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compra idCompra = detalleCompra.getIdCompra();
            if (idCompra != null) {
                idCompra = em.getReference(idCompra.getClass(), idCompra.getId());
                detalleCompra.setIdCompra(idCompra);
            }
            em.persist(detalleCompra);
            if (idCompra != null) {
                idCompra.getDetalleCompraCollection().add(detalleCompra);
                idCompra = em.merge(idCompra);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDetalleCompra(detalleCompra.getId()) != null) {
                throw new PreexistingEntityException("DetalleCompra " + detalleCompra + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleCompra detalleCompra) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DetalleCompra persistentDetalleCompra = em.find(DetalleCompra.class, detalleCompra.getId());
            Compra idCompraOld = persistentDetalleCompra.getIdCompra();
            Compra idCompraNew = detalleCompra.getIdCompra();
            if (idCompraNew != null) {
                idCompraNew = em.getReference(idCompraNew.getClass(), idCompraNew.getId());
                detalleCompra.setIdCompra(idCompraNew);
            }
            detalleCompra = em.merge(detalleCompra);
            if (idCompraOld != null && !idCompraOld.equals(idCompraNew)) {
                idCompraOld.getDetalleCompraCollection().remove(detalleCompra);
                idCompraOld = em.merge(idCompraOld);
            }
            if (idCompraNew != null && !idCompraNew.equals(idCompraOld)) {
                idCompraNew.getDetalleCompraCollection().add(detalleCompra);
                idCompraNew = em.merge(idCompraNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = detalleCompra.getId();
                if (findDetalleCompra(id) == null) {
                    throw new NonexistentEntityException("The detalleCompra with id " + id + " no longer exists.");
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
            DetalleCompra detalleCompra;
            try {
                detalleCompra = em.getReference(DetalleCompra.class, id);
                detalleCompra.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleCompra with id " + id + " no longer exists.", enfe);
            }
            Compra idCompra = detalleCompra.getIdCompra();
            if (idCompra != null) {
                idCompra.getDetalleCompraCollection().remove(detalleCompra);
                idCompra = em.merge(idCompra);
            }
            em.remove(detalleCompra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleCompra> findDetalleCompraEntities() {
        return findDetalleCompraEntities(true, -1, -1);
    }

    public List<DetalleCompra> findDetalleCompraEntities(int maxResults, int firstResult) {
        return findDetalleCompraEntities(false, maxResults, firstResult);
    }

    private List<DetalleCompra> findDetalleCompraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleCompra.class));
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

    public DetalleCompra findDetalleCompra(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleCompra.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleCompraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleCompra> rt = cq.from(DetalleCompra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
