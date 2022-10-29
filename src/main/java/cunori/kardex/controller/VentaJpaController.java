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
import cunori.kardex.dao.DetalleVenta;
import java.util.ArrayList;
import java.util.Collection;
import cunori.kardex.dao.KardexPEPS;
import cunori.kardex.dao.Venta;
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
        if (venta.getDetalleVentaCollection() == null) {
            venta.setDetalleVentaCollection(new ArrayList<DetalleVenta>());
        }
        if (venta.getKardexPEPSCollection() == null) {
            venta.setKardexPEPSCollection(new ArrayList<KardexPEPS>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<DetalleVenta> attachedDetalleVentaCollection = new ArrayList<DetalleVenta>();
            for (DetalleVenta detalleVentaCollectionDetalleVentaToAttach : venta.getDetalleVentaCollection()) {
                detalleVentaCollectionDetalleVentaToAttach = em.getReference(detalleVentaCollectionDetalleVentaToAttach.getClass(), detalleVentaCollectionDetalleVentaToAttach.getId());
                attachedDetalleVentaCollection.add(detalleVentaCollectionDetalleVentaToAttach);
            }
            venta.setDetalleVentaCollection(attachedDetalleVentaCollection);
            Collection<KardexPEPS> attachedKardexPEPSCollection = new ArrayList<KardexPEPS>();
            for (KardexPEPS kardexPEPSCollectionKardexPEPSToAttach : venta.getKardexPEPSCollection()) {
                kardexPEPSCollectionKardexPEPSToAttach = em.getReference(kardexPEPSCollectionKardexPEPSToAttach.getClass(), kardexPEPSCollectionKardexPEPSToAttach.getId());
                attachedKardexPEPSCollection.add(kardexPEPSCollectionKardexPEPSToAttach);
            }
            venta.setKardexPEPSCollection(attachedKardexPEPSCollection);
            em.persist(venta);
            for (DetalleVenta detalleVentaCollectionDetalleVenta : venta.getDetalleVentaCollection()) {
                Venta oldIdVentaOfDetalleVentaCollectionDetalleVenta = detalleVentaCollectionDetalleVenta.getIdVenta();
                detalleVentaCollectionDetalleVenta.setIdVenta(venta);
                detalleVentaCollectionDetalleVenta = em.merge(detalleVentaCollectionDetalleVenta);
                if (oldIdVentaOfDetalleVentaCollectionDetalleVenta != null) {
                    oldIdVentaOfDetalleVentaCollectionDetalleVenta.getDetalleVentaCollection().remove(detalleVentaCollectionDetalleVenta);
                    oldIdVentaOfDetalleVentaCollectionDetalleVenta = em.merge(oldIdVentaOfDetalleVentaCollectionDetalleVenta);
                }
            }
            for (KardexPEPS kardexPEPSCollectionKardexPEPS : venta.getKardexPEPSCollection()) {
                Venta oldIdVentaOfKardexPEPSCollectionKardexPEPS = kardexPEPSCollectionKardexPEPS.getIdVenta();
                kardexPEPSCollectionKardexPEPS.setIdVenta(venta);
                kardexPEPSCollectionKardexPEPS = em.merge(kardexPEPSCollectionKardexPEPS);
                if (oldIdVentaOfKardexPEPSCollectionKardexPEPS != null) {
                    oldIdVentaOfKardexPEPSCollectionKardexPEPS.getKardexPEPSCollection().remove(kardexPEPSCollectionKardexPEPS);
                    oldIdVentaOfKardexPEPSCollectionKardexPEPS = em.merge(oldIdVentaOfKardexPEPSCollectionKardexPEPS);
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
            Collection<DetalleVenta> detalleVentaCollectionOld = persistentVenta.getDetalleVentaCollection();
            Collection<DetalleVenta> detalleVentaCollectionNew = venta.getDetalleVentaCollection();
            Collection<KardexPEPS> kardexPEPSCollectionOld = persistentVenta.getKardexPEPSCollection();
            Collection<KardexPEPS> kardexPEPSCollectionNew = venta.getKardexPEPSCollection();
            List<String> illegalOrphanMessages = null;
            for (DetalleVenta detalleVentaCollectionOldDetalleVenta : detalleVentaCollectionOld) {
                if (!detalleVentaCollectionNew.contains(detalleVentaCollectionOldDetalleVenta)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain DetalleVenta " + detalleVentaCollectionOldDetalleVenta + " since its idVenta field is not nullable.");
                }
            }
            for (KardexPEPS kardexPEPSCollectionOldKardexPEPS : kardexPEPSCollectionOld) {
                if (!kardexPEPSCollectionNew.contains(kardexPEPSCollectionOldKardexPEPS)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain KardexPEPS " + kardexPEPSCollectionOldKardexPEPS + " since its idVenta field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<DetalleVenta> attachedDetalleVentaCollectionNew = new ArrayList<DetalleVenta>();
            for (DetalleVenta detalleVentaCollectionNewDetalleVentaToAttach : detalleVentaCollectionNew) {
                detalleVentaCollectionNewDetalleVentaToAttach = em.getReference(detalleVentaCollectionNewDetalleVentaToAttach.getClass(), detalleVentaCollectionNewDetalleVentaToAttach.getId());
                attachedDetalleVentaCollectionNew.add(detalleVentaCollectionNewDetalleVentaToAttach);
            }
            detalleVentaCollectionNew = attachedDetalleVentaCollectionNew;
            venta.setDetalleVentaCollection(detalleVentaCollectionNew);
            Collection<KardexPEPS> attachedKardexPEPSCollectionNew = new ArrayList<KardexPEPS>();
            for (KardexPEPS kardexPEPSCollectionNewKardexPEPSToAttach : kardexPEPSCollectionNew) {
                kardexPEPSCollectionNewKardexPEPSToAttach = em.getReference(kardexPEPSCollectionNewKardexPEPSToAttach.getClass(), kardexPEPSCollectionNewKardexPEPSToAttach.getId());
                attachedKardexPEPSCollectionNew.add(kardexPEPSCollectionNewKardexPEPSToAttach);
            }
            kardexPEPSCollectionNew = attachedKardexPEPSCollectionNew;
            venta.setKardexPEPSCollection(kardexPEPSCollectionNew);
            venta = em.merge(venta);
            for (DetalleVenta detalleVentaCollectionNewDetalleVenta : detalleVentaCollectionNew) {
                if (!detalleVentaCollectionOld.contains(detalleVentaCollectionNewDetalleVenta)) {
                    Venta oldIdVentaOfDetalleVentaCollectionNewDetalleVenta = detalleVentaCollectionNewDetalleVenta.getIdVenta();
                    detalleVentaCollectionNewDetalleVenta.setIdVenta(venta);
                    detalleVentaCollectionNewDetalleVenta = em.merge(detalleVentaCollectionNewDetalleVenta);
                    if (oldIdVentaOfDetalleVentaCollectionNewDetalleVenta != null && !oldIdVentaOfDetalleVentaCollectionNewDetalleVenta.equals(venta)) {
                        oldIdVentaOfDetalleVentaCollectionNewDetalleVenta.getDetalleVentaCollection().remove(detalleVentaCollectionNewDetalleVenta);
                        oldIdVentaOfDetalleVentaCollectionNewDetalleVenta = em.merge(oldIdVentaOfDetalleVentaCollectionNewDetalleVenta);
                    }
                }
            }
            for (KardexPEPS kardexPEPSCollectionNewKardexPEPS : kardexPEPSCollectionNew) {
                if (!kardexPEPSCollectionOld.contains(kardexPEPSCollectionNewKardexPEPS)) {
                    Venta oldIdVentaOfKardexPEPSCollectionNewKardexPEPS = kardexPEPSCollectionNewKardexPEPS.getIdVenta();
                    kardexPEPSCollectionNewKardexPEPS.setIdVenta(venta);
                    kardexPEPSCollectionNewKardexPEPS = em.merge(kardexPEPSCollectionNewKardexPEPS);
                    if (oldIdVentaOfKardexPEPSCollectionNewKardexPEPS != null && !oldIdVentaOfKardexPEPSCollectionNewKardexPEPS.equals(venta)) {
                        oldIdVentaOfKardexPEPSCollectionNewKardexPEPS.getKardexPEPSCollection().remove(kardexPEPSCollectionNewKardexPEPS);
                        oldIdVentaOfKardexPEPSCollectionNewKardexPEPS = em.merge(oldIdVentaOfKardexPEPSCollectionNewKardexPEPS);
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
            Collection<DetalleVenta> detalleVentaCollectionOrphanCheck = venta.getDetalleVentaCollection();
            for (DetalleVenta detalleVentaCollectionOrphanCheckDetalleVenta : detalleVentaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Venta (" + venta + ") cannot be destroyed since the DetalleVenta " + detalleVentaCollectionOrphanCheckDetalleVenta + " in its detalleVentaCollection field has a non-nullable idVenta field.");
            }
            Collection<KardexPEPS> kardexPEPSCollectionOrphanCheck = venta.getKardexPEPSCollection();
            for (KardexPEPS kardexPEPSCollectionOrphanCheckKardexPEPS : kardexPEPSCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Venta (" + venta + ") cannot be destroyed since the KardexPEPS " + kardexPEPSCollectionOrphanCheckKardexPEPS + " in its kardexPEPSCollection field has a non-nullable idVenta field.");
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
