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
import cunori.kardex.dao.KardexPEPS;
import cunori.kardex.dao.Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class KardexPEPSJpaController implements Serializable {

    public KardexPEPSJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(KardexPEPS kardexPEPS) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compra idCompra = kardexPEPS.getIdCompra();
            if (idCompra != null) {
                idCompra = em.getReference(idCompra.getClass(), idCompra.getId());
                kardexPEPS.setIdCompra(idCompra);
            }
            Venta idVenta = kardexPEPS.getIdVenta();
            if (idVenta != null) {
                idVenta = em.getReference(idVenta.getClass(), idVenta.getId());
                kardexPEPS.setIdVenta(idVenta);
            }
            em.persist(kardexPEPS);
            if (idCompra != null) {
                idCompra.getKardexPEPSCollection().add(kardexPEPS);
                idCompra = em.merge(idCompra);
            }
            if (idVenta != null) {
                idVenta.getKardexPEPSCollection().add(kardexPEPS);
                idVenta = em.merge(idVenta);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findKardexPEPS(kardexPEPS.getId()) != null) {
                throw new PreexistingEntityException("KardexPEPS " + kardexPEPS + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(KardexPEPS kardexPEPS) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            KardexPEPS persistentKardexPEPS = em.find(KardexPEPS.class, kardexPEPS.getId());
            Compra idCompraOld = persistentKardexPEPS.getIdCompra();
            Compra idCompraNew = kardexPEPS.getIdCompra();
            Venta idVentaOld = persistentKardexPEPS.getIdVenta();
            Venta idVentaNew = kardexPEPS.getIdVenta();
            if (idCompraNew != null) {
                idCompraNew = em.getReference(idCompraNew.getClass(), idCompraNew.getId());
                kardexPEPS.setIdCompra(idCompraNew);
            }
            if (idVentaNew != null) {
                idVentaNew = em.getReference(idVentaNew.getClass(), idVentaNew.getId());
                kardexPEPS.setIdVenta(idVentaNew);
            }
            kardexPEPS = em.merge(kardexPEPS);
            if (idCompraOld != null && !idCompraOld.equals(idCompraNew)) {
                idCompraOld.getKardexPEPSCollection().remove(kardexPEPS);
                idCompraOld = em.merge(idCompraOld);
            }
            if (idCompraNew != null && !idCompraNew.equals(idCompraOld)) {
                idCompraNew.getKardexPEPSCollection().add(kardexPEPS);
                idCompraNew = em.merge(idCompraNew);
            }
            if (idVentaOld != null && !idVentaOld.equals(idVentaNew)) {
                idVentaOld.getKardexPEPSCollection().remove(kardexPEPS);
                idVentaOld = em.merge(idVentaOld);
            }
            if (idVentaNew != null && !idVentaNew.equals(idVentaOld)) {
                idVentaNew.getKardexPEPSCollection().add(kardexPEPS);
                idVentaNew = em.merge(idVentaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = kardexPEPS.getId();
                if (findKardexPEPS(id) == null) {
                    throw new NonexistentEntityException("The kardexPEPS with id " + id + " no longer exists.");
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
            KardexPEPS kardexPEPS;
            try {
                kardexPEPS = em.getReference(KardexPEPS.class, id);
                kardexPEPS.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The kardexPEPS with id " + id + " no longer exists.", enfe);
            }
            Compra idCompra = kardexPEPS.getIdCompra();
            if (idCompra != null) {
                idCompra.getKardexPEPSCollection().remove(kardexPEPS);
                idCompra = em.merge(idCompra);
            }
            Venta idVenta = kardexPEPS.getIdVenta();
            if (idVenta != null) {
                idVenta.getKardexPEPSCollection().remove(kardexPEPS);
                idVenta = em.merge(idVenta);
            }
            em.remove(kardexPEPS);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<KardexPEPS> findKardexPEPSEntities() {
        return findKardexPEPSEntities(true, -1, -1);
    }

    public List<KardexPEPS> findKardexPEPSEntities(int maxResults, int firstResult) {
        return findKardexPEPSEntities(false, maxResults, firstResult);
    }

    private List<KardexPEPS> findKardexPEPSEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(KardexPEPS.class));
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

    public KardexPEPS findKardexPEPS(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(KardexPEPS.class, id);
        } finally {
            em.close();
        }
    }

    public int getKardexPEPSCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<KardexPEPS> rt = cq.from(KardexPEPS.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
