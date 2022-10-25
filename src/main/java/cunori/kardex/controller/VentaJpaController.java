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
import cunori.kardex.dao.Cliente;
import cunori.kardex.dao.Producto;
import cunori.kardex.dao.Usuario;
import cunori.kardex.dao.Factura;
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
        if (venta.getFacturaCollection() == null) {
            venta.setFacturaCollection(new ArrayList<Factura>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = venta.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getId());
                venta.setCliente(cliente);
            }
            Producto producto = venta.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getCodigo());
                venta.setProducto(producto);
            }
            Usuario vendedor = venta.getVendedor();
            if (vendedor != null) {
                vendedor = em.getReference(vendedor.getClass(), vendedor.getId());
                venta.setVendedor(vendedor);
            }
            Collection<Factura> attachedFacturaCollection = new ArrayList<Factura>();
            for (Factura facturaCollectionFacturaToAttach : venta.getFacturaCollection()) {
                facturaCollectionFacturaToAttach = em.getReference(facturaCollectionFacturaToAttach.getClass(), facturaCollectionFacturaToAttach.getNoSerie());
                attachedFacturaCollection.add(facturaCollectionFacturaToAttach);
            }
            venta.setFacturaCollection(attachedFacturaCollection);
            em.persist(venta);
            if (cliente != null) {
                cliente.getVentaCollection().add(venta);
                cliente = em.merge(cliente);
            }
            if (producto != null) {
                producto.getVentaCollection().add(venta);
                producto = em.merge(producto);
            }
            if (vendedor != null) {
                vendedor.getVentaCollection().add(venta);
                vendedor = em.merge(vendedor);
            }
            for (Factura facturaCollectionFactura : venta.getFacturaCollection()) {
                Venta oldDetalleVentaOfFacturaCollectionFactura = facturaCollectionFactura.getDetalleVenta();
                facturaCollectionFactura.setDetalleVenta(venta);
                facturaCollectionFactura = em.merge(facturaCollectionFactura);
                if (oldDetalleVentaOfFacturaCollectionFactura != null) {
                    oldDetalleVentaOfFacturaCollectionFactura.getFacturaCollection().remove(facturaCollectionFactura);
                    oldDetalleVentaOfFacturaCollectionFactura = em.merge(oldDetalleVentaOfFacturaCollectionFactura);
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
            Cliente clienteOld = persistentVenta.getCliente();
            Cliente clienteNew = venta.getCliente();
            Producto productoOld = persistentVenta.getProducto();
            Producto productoNew = venta.getProducto();
            Usuario vendedorOld = persistentVenta.getVendedor();
            Usuario vendedorNew = venta.getVendedor();
            Collection<Factura> facturaCollectionOld = persistentVenta.getFacturaCollection();
            Collection<Factura> facturaCollectionNew = venta.getFacturaCollection();
            List<String> illegalOrphanMessages = null;
            for (Factura facturaCollectionOldFactura : facturaCollectionOld) {
                if (!facturaCollectionNew.contains(facturaCollectionOldFactura)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Factura " + facturaCollectionOldFactura + " since its detalleVenta field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getId());
                venta.setCliente(clienteNew);
            }
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getCodigo());
                venta.setProducto(productoNew);
            }
            if (vendedorNew != null) {
                vendedorNew = em.getReference(vendedorNew.getClass(), vendedorNew.getId());
                venta.setVendedor(vendedorNew);
            }
            Collection<Factura> attachedFacturaCollectionNew = new ArrayList<Factura>();
            for (Factura facturaCollectionNewFacturaToAttach : facturaCollectionNew) {
                facturaCollectionNewFacturaToAttach = em.getReference(facturaCollectionNewFacturaToAttach.getClass(), facturaCollectionNewFacturaToAttach.getNoSerie());
                attachedFacturaCollectionNew.add(facturaCollectionNewFacturaToAttach);
            }
            facturaCollectionNew = attachedFacturaCollectionNew;
            venta.setFacturaCollection(facturaCollectionNew);
            venta = em.merge(venta);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.getVentaCollection().remove(venta);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                clienteNew.getVentaCollection().add(venta);
                clienteNew = em.merge(clienteNew);
            }
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.getVentaCollection().remove(venta);
                productoOld = em.merge(productoOld);
            }
            if (productoNew != null && !productoNew.equals(productoOld)) {
                productoNew.getVentaCollection().add(venta);
                productoNew = em.merge(productoNew);
            }
            if (vendedorOld != null && !vendedorOld.equals(vendedorNew)) {
                vendedorOld.getVentaCollection().remove(venta);
                vendedorOld = em.merge(vendedorOld);
            }
            if (vendedorNew != null && !vendedorNew.equals(vendedorOld)) {
                vendedorNew.getVentaCollection().add(venta);
                vendedorNew = em.merge(vendedorNew);
            }
            for (Factura facturaCollectionNewFactura : facturaCollectionNew) {
                if (!facturaCollectionOld.contains(facturaCollectionNewFactura)) {
                    Venta oldDetalleVentaOfFacturaCollectionNewFactura = facturaCollectionNewFactura.getDetalleVenta();
                    facturaCollectionNewFactura.setDetalleVenta(venta);
                    facturaCollectionNewFactura = em.merge(facturaCollectionNewFactura);
                    if (oldDetalleVentaOfFacturaCollectionNewFactura != null && !oldDetalleVentaOfFacturaCollectionNewFactura.equals(venta)) {
                        oldDetalleVentaOfFacturaCollectionNewFactura.getFacturaCollection().remove(facturaCollectionNewFactura);
                        oldDetalleVentaOfFacturaCollectionNewFactura = em.merge(oldDetalleVentaOfFacturaCollectionNewFactura);
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
            Collection<Factura> facturaCollectionOrphanCheck = venta.getFacturaCollection();
            for (Factura facturaCollectionOrphanCheckFactura : facturaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Venta (" + venta + ") cannot be destroyed since the Factura " + facturaCollectionOrphanCheckFactura + " in its facturaCollection field has a non-nullable detalleVenta field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Cliente cliente = venta.getCliente();
            if (cliente != null) {
                cliente.getVentaCollection().remove(venta);
                cliente = em.merge(cliente);
            }
            Producto producto = venta.getProducto();
            if (producto != null) {
                producto.getVentaCollection().remove(venta);
                producto = em.merge(producto);
            }
            Usuario vendedor = venta.getVendedor();
            if (vendedor != null) {
                vendedor.getVentaCollection().remove(venta);
                vendedor = em.merge(vendedor);
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
