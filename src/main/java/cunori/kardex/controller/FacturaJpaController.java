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
import cunori.kardex.dao.Factura;
import cunori.kardex.dao.Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class FacturaJpaController implements Serializable {

    public FacturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Factura factura) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compra detalleCompra = factura.getDetalleCompra();
            if (detalleCompra != null) {
                detalleCompra = em.getReference(detalleCompra.getClass(), detalleCompra.getId());
                factura.setDetalleCompra(detalleCompra);
            }
            Venta detalleVenta = factura.getDetalleVenta();
            if (detalleVenta != null) {
                detalleVenta = em.getReference(detalleVenta.getClass(), detalleVenta.getId());
                factura.setDetalleVenta(detalleVenta);
            }
            em.persist(factura);
            if (detalleCompra != null) {
                detalleCompra.getFacturaCollection().add(factura);
                detalleCompra = em.merge(detalleCompra);
            }
            if (detalleVenta != null) {
                detalleVenta.getFacturaCollection().add(factura);
                detalleVenta = em.merge(detalleVenta);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findFactura(factura.getNoSerie()) != null) {
                throw new PreexistingEntityException("Factura " + factura + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Factura factura) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Factura persistentFactura = em.find(Factura.class, factura.getNoSerie());
            Compra detalleCompraOld = persistentFactura.getDetalleCompra();
            Compra detalleCompraNew = factura.getDetalleCompra();
            Venta detalleVentaOld = persistentFactura.getDetalleVenta();
            Venta detalleVentaNew = factura.getDetalleVenta();
            if (detalleCompraNew != null) {
                detalleCompraNew = em.getReference(detalleCompraNew.getClass(), detalleCompraNew.getId());
                factura.setDetalleCompra(detalleCompraNew);
            }
            if (detalleVentaNew != null) {
                detalleVentaNew = em.getReference(detalleVentaNew.getClass(), detalleVentaNew.getId());
                factura.setDetalleVenta(detalleVentaNew);
            }
            factura = em.merge(factura);
            if (detalleCompraOld != null && !detalleCompraOld.equals(detalleCompraNew)) {
                detalleCompraOld.getFacturaCollection().remove(factura);
                detalleCompraOld = em.merge(detalleCompraOld);
            }
            if (detalleCompraNew != null && !detalleCompraNew.equals(detalleCompraOld)) {
                detalleCompraNew.getFacturaCollection().add(factura);
                detalleCompraNew = em.merge(detalleCompraNew);
            }
            if (detalleVentaOld != null && !detalleVentaOld.equals(detalleVentaNew)) {
                detalleVentaOld.getFacturaCollection().remove(factura);
                detalleVentaOld = em.merge(detalleVentaOld);
            }
            if (detalleVentaNew != null && !detalleVentaNew.equals(detalleVentaOld)) {
                detalleVentaNew.getFacturaCollection().add(factura);
                detalleVentaNew = em.merge(detalleVentaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = factura.getNoSerie();
                if (findFactura(id) == null) {
                    throw new NonexistentEntityException("The factura with id " + id + " no longer exists.");
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
            Factura factura;
            try {
                factura = em.getReference(Factura.class, id);
                factura.getNoSerie();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The factura with id " + id + " no longer exists.", enfe);
            }
            Compra detalleCompra = factura.getDetalleCompra();
            if (detalleCompra != null) {
                detalleCompra.getFacturaCollection().remove(factura);
                detalleCompra = em.merge(detalleCompra);
            }
            Venta detalleVenta = factura.getDetalleVenta();
            if (detalleVenta != null) {
                detalleVenta.getFacturaCollection().remove(factura);
                detalleVenta = em.merge(detalleVenta);
            }
            em.remove(factura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Factura> findFacturaEntities() {
        return findFacturaEntities(true, -1, -1);
    }

    public List<Factura> findFacturaEntities(int maxResults, int firstResult) {
        return findFacturaEntities(false, maxResults, firstResult);
    }

    private List<Factura> findFacturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Factura.class));
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

    public Factura findFactura(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Factura.class, id);
        } finally {
            em.close();
        }
    }

    public int getFacturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Factura> rt = cq.from(Factura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
