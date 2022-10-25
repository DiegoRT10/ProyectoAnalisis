/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.IllegalOrphanException;
import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import cunori.kardex.dao.Compra;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import cunori.kardex.dao.Producto;
import cunori.kardex.dao.Proveedor;
import cunori.kardex.dao.Factura;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class CompraJpaController implements Serializable {

    public CompraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Compra compra) throws PreexistingEntityException, Exception {
        if (compra.getFacturaCollection() == null) {
            compra.setFacturaCollection(new ArrayList<Factura>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto = compra.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getCodigo());
                compra.setProducto(producto);
            }
            Proveedor proveedor = compra.getProveedor();
            if (proveedor != null) {
                proveedor = em.getReference(proveedor.getClass(), proveedor.getId());
                compra.setProveedor(proveedor);
            }
            Collection<Factura> attachedFacturaCollection = new ArrayList<Factura>();
            for (Factura facturaCollectionFacturaToAttach : compra.getFacturaCollection()) {
                facturaCollectionFacturaToAttach = em.getReference(facturaCollectionFacturaToAttach.getClass(), facturaCollectionFacturaToAttach.getNoSerie());
                attachedFacturaCollection.add(facturaCollectionFacturaToAttach);
            }
            compra.setFacturaCollection(attachedFacturaCollection);
            em.persist(compra);
            if (producto != null) {
                producto.getCompraCollection().add(compra);
                producto = em.merge(producto);
            }
            if (proveedor != null) {
                proveedor.getCompraCollection().add(compra);
                proveedor = em.merge(proveedor);
            }
            for (Factura facturaCollectionFactura : compra.getFacturaCollection()) {
                Compra oldDetalleCompraOfFacturaCollectionFactura = facturaCollectionFactura.getDetalleCompra();
                facturaCollectionFactura.setDetalleCompra(compra);
                facturaCollectionFactura = em.merge(facturaCollectionFactura);
                if (oldDetalleCompraOfFacturaCollectionFactura != null) {
                    oldDetalleCompraOfFacturaCollectionFactura.getFacturaCollection().remove(facturaCollectionFactura);
                    oldDetalleCompraOfFacturaCollectionFactura = em.merge(oldDetalleCompraOfFacturaCollectionFactura);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCompra(compra.getId()) != null) {
                throw new PreexistingEntityException("Compra " + compra + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Compra compra) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compra persistentCompra = em.find(Compra.class, compra.getId());
            Producto productoOld = persistentCompra.getProducto();
            Producto productoNew = compra.getProducto();
            Proveedor proveedorOld = persistentCompra.getProveedor();
            Proveedor proveedorNew = compra.getProveedor();
            Collection<Factura> facturaCollectionOld = persistentCompra.getFacturaCollection();
            Collection<Factura> facturaCollectionNew = compra.getFacturaCollection();
            List<String> illegalOrphanMessages = null;
            for (Factura facturaCollectionOldFactura : facturaCollectionOld) {
                if (!facturaCollectionNew.contains(facturaCollectionOldFactura)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Factura " + facturaCollectionOldFactura + " since its detalleCompra field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getCodigo());
                compra.setProducto(productoNew);
            }
            if (proveedorNew != null) {
                proveedorNew = em.getReference(proveedorNew.getClass(), proveedorNew.getId());
                compra.setProveedor(proveedorNew);
            }
            Collection<Factura> attachedFacturaCollectionNew = new ArrayList<Factura>();
            for (Factura facturaCollectionNewFacturaToAttach : facturaCollectionNew) {
                facturaCollectionNewFacturaToAttach = em.getReference(facturaCollectionNewFacturaToAttach.getClass(), facturaCollectionNewFacturaToAttach.getNoSerie());
                attachedFacturaCollectionNew.add(facturaCollectionNewFacturaToAttach);
            }
            facturaCollectionNew = attachedFacturaCollectionNew;
            compra.setFacturaCollection(facturaCollectionNew);
            compra = em.merge(compra);
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.getCompraCollection().remove(compra);
                productoOld = em.merge(productoOld);
            }
            if (productoNew != null && !productoNew.equals(productoOld)) {
                productoNew.getCompraCollection().add(compra);
                productoNew = em.merge(productoNew);
            }
            if (proveedorOld != null && !proveedorOld.equals(proveedorNew)) {
                proveedorOld.getCompraCollection().remove(compra);
                proveedorOld = em.merge(proveedorOld);
            }
            if (proveedorNew != null && !proveedorNew.equals(proveedorOld)) {
                proveedorNew.getCompraCollection().add(compra);
                proveedorNew = em.merge(proveedorNew);
            }
            for (Factura facturaCollectionNewFactura : facturaCollectionNew) {
                if (!facturaCollectionOld.contains(facturaCollectionNewFactura)) {
                    Compra oldDetalleCompraOfFacturaCollectionNewFactura = facturaCollectionNewFactura.getDetalleCompra();
                    facturaCollectionNewFactura.setDetalleCompra(compra);
                    facturaCollectionNewFactura = em.merge(facturaCollectionNewFactura);
                    if (oldDetalleCompraOfFacturaCollectionNewFactura != null && !oldDetalleCompraOfFacturaCollectionNewFactura.equals(compra)) {
                        oldDetalleCompraOfFacturaCollectionNewFactura.getFacturaCollection().remove(facturaCollectionNewFactura);
                        oldDetalleCompraOfFacturaCollectionNewFactura = em.merge(oldDetalleCompraOfFacturaCollectionNewFactura);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = compra.getId();
                if (findCompra(id) == null) {
                    throw new NonexistentEntityException("The compra with id " + id + " no longer exists.");
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
            Compra compra;
            try {
                compra = em.getReference(Compra.class, id);
                compra.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The compra with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Factura> facturaCollectionOrphanCheck = compra.getFacturaCollection();
            for (Factura facturaCollectionOrphanCheckFactura : facturaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Compra (" + compra + ") cannot be destroyed since the Factura " + facturaCollectionOrphanCheckFactura + " in its facturaCollection field has a non-nullable detalleCompra field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Producto producto = compra.getProducto();
            if (producto != null) {
                producto.getCompraCollection().remove(compra);
                producto = em.merge(producto);
            }
            Proveedor proveedor = compra.getProveedor();
            if (proveedor != null) {
                proveedor.getCompraCollection().remove(compra);
                proveedor = em.merge(proveedor);
            }
            em.remove(compra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Compra> findCompraEntities() {
        return findCompraEntities(true, -1, -1);
    }

    public List<Compra> findCompraEntities(int maxResults, int firstResult) {
        return findCompraEntities(false, maxResults, firstResult);
    }

    private List<Compra> findCompraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Compra.class));
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

    public Compra findCompra(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Compra.class, id);
        } finally {
            em.close();
        }
    }

    public int getCompraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Compra> rt = cq.from(Compra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
