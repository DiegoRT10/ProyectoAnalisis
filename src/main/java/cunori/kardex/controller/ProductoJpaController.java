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
import cunori.kardex.dao.Venta;
import java.util.ArrayList;
import java.util.Collection;
import cunori.kardex.dao.Compra;
import cunori.kardex.dao.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) throws PreexistingEntityException, Exception {
        if (producto.getVentaCollection() == null) {
            producto.setVentaCollection(new ArrayList<Venta>());
        }
        if (producto.getCompraCollection() == null) {
            producto.setCompraCollection(new ArrayList<Compra>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Venta> attachedVentaCollection = new ArrayList<Venta>();
            for (Venta ventaCollectionVentaToAttach : producto.getVentaCollection()) {
                ventaCollectionVentaToAttach = em.getReference(ventaCollectionVentaToAttach.getClass(), ventaCollectionVentaToAttach.getId());
                attachedVentaCollection.add(ventaCollectionVentaToAttach);
            }
            producto.setVentaCollection(attachedVentaCollection);
            Collection<Compra> attachedCompraCollection = new ArrayList<Compra>();
            for (Compra compraCollectionCompraToAttach : producto.getCompraCollection()) {
                compraCollectionCompraToAttach = em.getReference(compraCollectionCompraToAttach.getClass(), compraCollectionCompraToAttach.getId());
                attachedCompraCollection.add(compraCollectionCompraToAttach);
            }
            producto.setCompraCollection(attachedCompraCollection);
            em.persist(producto);
            for (Venta ventaCollectionVenta : producto.getVentaCollection()) {
                Producto oldProductoOfVentaCollectionVenta = ventaCollectionVenta.getProducto();
                ventaCollectionVenta.setProducto(producto);
                ventaCollectionVenta = em.merge(ventaCollectionVenta);
                if (oldProductoOfVentaCollectionVenta != null) {
                    oldProductoOfVentaCollectionVenta.getVentaCollection().remove(ventaCollectionVenta);
                    oldProductoOfVentaCollectionVenta = em.merge(oldProductoOfVentaCollectionVenta);
                }
            }
            for (Compra compraCollectionCompra : producto.getCompraCollection()) {
                Producto oldProductoOfCompraCollectionCompra = compraCollectionCompra.getProducto();
                compraCollectionCompra.setProducto(producto);
                compraCollectionCompra = em.merge(compraCollectionCompra);
                if (oldProductoOfCompraCollectionCompra != null) {
                    oldProductoOfCompraCollectionCompra.getCompraCollection().remove(compraCollectionCompra);
                    oldProductoOfCompraCollectionCompra = em.merge(oldProductoOfCompraCollectionCompra);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProducto(producto.getCodigo()) != null) {
                throw new PreexistingEntityException("Producto " + producto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getCodigo());
            Collection<Venta> ventaCollectionOld = persistentProducto.getVentaCollection();
            Collection<Venta> ventaCollectionNew = producto.getVentaCollection();
            Collection<Compra> compraCollectionOld = persistentProducto.getCompraCollection();
            Collection<Compra> compraCollectionNew = producto.getCompraCollection();
            List<String> illegalOrphanMessages = null;
            for (Venta ventaCollectionOldVenta : ventaCollectionOld) {
                if (!ventaCollectionNew.contains(ventaCollectionOldVenta)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Venta " + ventaCollectionOldVenta + " since its producto field is not nullable.");
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
            producto.setVentaCollection(ventaCollectionNew);
            Collection<Compra> attachedCompraCollectionNew = new ArrayList<Compra>();
            for (Compra compraCollectionNewCompraToAttach : compraCollectionNew) {
                compraCollectionNewCompraToAttach = em.getReference(compraCollectionNewCompraToAttach.getClass(), compraCollectionNewCompraToAttach.getId());
                attachedCompraCollectionNew.add(compraCollectionNewCompraToAttach);
            }
            compraCollectionNew = attachedCompraCollectionNew;
            producto.setCompraCollection(compraCollectionNew);
            producto = em.merge(producto);
            for (Venta ventaCollectionNewVenta : ventaCollectionNew) {
                if (!ventaCollectionOld.contains(ventaCollectionNewVenta)) {
                    Producto oldProductoOfVentaCollectionNewVenta = ventaCollectionNewVenta.getProducto();
                    ventaCollectionNewVenta.setProducto(producto);
                    ventaCollectionNewVenta = em.merge(ventaCollectionNewVenta);
                    if (oldProductoOfVentaCollectionNewVenta != null && !oldProductoOfVentaCollectionNewVenta.equals(producto)) {
                        oldProductoOfVentaCollectionNewVenta.getVentaCollection().remove(ventaCollectionNewVenta);
                        oldProductoOfVentaCollectionNewVenta = em.merge(oldProductoOfVentaCollectionNewVenta);
                    }
                }
            }
            for (Compra compraCollectionOldCompra : compraCollectionOld) {
                if (!compraCollectionNew.contains(compraCollectionOldCompra)) {
                    compraCollectionOldCompra.setProducto(null);
                    compraCollectionOldCompra = em.merge(compraCollectionOldCompra);
                }
            }
            for (Compra compraCollectionNewCompra : compraCollectionNew) {
                if (!compraCollectionOld.contains(compraCollectionNewCompra)) {
                    Producto oldProductoOfCompraCollectionNewCompra = compraCollectionNewCompra.getProducto();
                    compraCollectionNewCompra.setProducto(producto);
                    compraCollectionNewCompra = em.merge(compraCollectionNewCompra);
                    if (oldProductoOfCompraCollectionNewCompra != null && !oldProductoOfCompraCollectionNewCompra.equals(producto)) {
                        oldProductoOfCompraCollectionNewCompra.getCompraCollection().remove(compraCollectionNewCompra);
                        oldProductoOfCompraCollectionNewCompra = em.merge(oldProductoOfCompraCollectionNewCompra);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = producto.getCodigo();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
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
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Venta> ventaCollectionOrphanCheck = producto.getVentaCollection();
            for (Venta ventaCollectionOrphanCheckVenta : ventaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Producto (" + producto + ") cannot be destroyed since the Venta " + ventaCollectionOrphanCheckVenta + " in its ventaCollection field has a non-nullable producto field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Compra> compraCollection = producto.getCompraCollection();
            for (Compra compraCollectionCompra : compraCollection) {
                compraCollectionCompra.setProducto(null);
                compraCollectionCompra = em.merge(compraCollectionCompra);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
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

    public Producto findProducto(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
