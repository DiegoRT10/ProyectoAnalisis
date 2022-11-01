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
import cunori.kardex.dao.DetalleCompra;
import java.util.ArrayList;
import java.util.Collection;
import cunori.kardex.dao.KardexPEPS;
import cunori.kardex.dao.LibroCompra;
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
        if (compra.getDetalleCompraCollection() == null) {
            compra.setDetalleCompraCollection(new ArrayList<DetalleCompra>());
        }
        if (compra.getKardexPEPSCollection() == null) {
            compra.setKardexPEPSCollection(new ArrayList<KardexPEPS>());
        }
        if (compra.getLibroCompraCollection() == null) {
            compra.setLibroCompraCollection(new ArrayList<LibroCompra>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<DetalleCompra> attachedDetalleCompraCollection = new ArrayList<DetalleCompra>();
            for (DetalleCompra detalleCompraCollectionDetalleCompraToAttach : compra.getDetalleCompraCollection()) {
                detalleCompraCollectionDetalleCompraToAttach = em.getReference(detalleCompraCollectionDetalleCompraToAttach.getClass(), detalleCompraCollectionDetalleCompraToAttach.getId());
                attachedDetalleCompraCollection.add(detalleCompraCollectionDetalleCompraToAttach);
            }
            compra.setDetalleCompraCollection(attachedDetalleCompraCollection);
            Collection<KardexPEPS> attachedKardexPEPSCollection = new ArrayList<KardexPEPS>();
            for (KardexPEPS kardexPEPSCollectionKardexPEPSToAttach : compra.getKardexPEPSCollection()) {
                kardexPEPSCollectionKardexPEPSToAttach = em.getReference(kardexPEPSCollectionKardexPEPSToAttach.getClass(), kardexPEPSCollectionKardexPEPSToAttach.getId());
                attachedKardexPEPSCollection.add(kardexPEPSCollectionKardexPEPSToAttach);
            }
            compra.setKardexPEPSCollection(attachedKardexPEPSCollection);
            Collection<LibroCompra> attachedLibroCompraCollection = new ArrayList<LibroCompra>();
            for (LibroCompra libroCompraCollectionLibroCompraToAttach : compra.getLibroCompraCollection()) {
                libroCompraCollectionLibroCompraToAttach = em.getReference(libroCompraCollectionLibroCompraToAttach.getClass(), libroCompraCollectionLibroCompraToAttach.getId());
                attachedLibroCompraCollection.add(libroCompraCollectionLibroCompraToAttach);
            }
            compra.setLibroCompraCollection(attachedLibroCompraCollection);
            em.persist(compra);
            for (DetalleCompra detalleCompraCollectionDetalleCompra : compra.getDetalleCompraCollection()) {
                Compra oldIdCompraOfDetalleCompraCollectionDetalleCompra = detalleCompraCollectionDetalleCompra.getIdCompra();
                detalleCompraCollectionDetalleCompra.setIdCompra(compra);
                detalleCompraCollectionDetalleCompra = em.merge(detalleCompraCollectionDetalleCompra);
                if (oldIdCompraOfDetalleCompraCollectionDetalleCompra != null) {
                    oldIdCompraOfDetalleCompraCollectionDetalleCompra.getDetalleCompraCollection().remove(detalleCompraCollectionDetalleCompra);
                    oldIdCompraOfDetalleCompraCollectionDetalleCompra = em.merge(oldIdCompraOfDetalleCompraCollectionDetalleCompra);
                }
            }
            for (KardexPEPS kardexPEPSCollectionKardexPEPS : compra.getKardexPEPSCollection()) {
                Compra oldIdCompraOfKardexPEPSCollectionKardexPEPS = kardexPEPSCollectionKardexPEPS.getIdCompra();
                kardexPEPSCollectionKardexPEPS.setIdCompra(compra);
                kardexPEPSCollectionKardexPEPS = em.merge(kardexPEPSCollectionKardexPEPS);
                if (oldIdCompraOfKardexPEPSCollectionKardexPEPS != null) {
                    oldIdCompraOfKardexPEPSCollectionKardexPEPS.getKardexPEPSCollection().remove(kardexPEPSCollectionKardexPEPS);
                    oldIdCompraOfKardexPEPSCollectionKardexPEPS = em.merge(oldIdCompraOfKardexPEPSCollectionKardexPEPS);
                }
            }
            for (LibroCompra libroCompraCollectionLibroCompra : compra.getLibroCompraCollection()) {
                Compra oldIdCompraOfLibroCompraCollectionLibroCompra = libroCompraCollectionLibroCompra.getIdCompra();
                libroCompraCollectionLibroCompra.setIdCompra(compra);
                libroCompraCollectionLibroCompra = em.merge(libroCompraCollectionLibroCompra);
                if (oldIdCompraOfLibroCompraCollectionLibroCompra != null) {
                    oldIdCompraOfLibroCompraCollectionLibroCompra.getLibroCompraCollection().remove(libroCompraCollectionLibroCompra);
                    oldIdCompraOfLibroCompraCollectionLibroCompra = em.merge(oldIdCompraOfLibroCompraCollectionLibroCompra);
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
            Collection<DetalleCompra> detalleCompraCollectionOld = persistentCompra.getDetalleCompraCollection();
            Collection<DetalleCompra> detalleCompraCollectionNew = compra.getDetalleCompraCollection();
            Collection<KardexPEPS> kardexPEPSCollectionOld = persistentCompra.getKardexPEPSCollection();
            Collection<KardexPEPS> kardexPEPSCollectionNew = compra.getKardexPEPSCollection();
            Collection<LibroCompra> libroCompraCollectionOld = persistentCompra.getLibroCompraCollection();
            Collection<LibroCompra> libroCompraCollectionNew = compra.getLibroCompraCollection();
            List<String> illegalOrphanMessages = null;
            for (DetalleCompra detalleCompraCollectionOldDetalleCompra : detalleCompraCollectionOld) {
                if (!detalleCompraCollectionNew.contains(detalleCompraCollectionOldDetalleCompra)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain DetalleCompra " + detalleCompraCollectionOldDetalleCompra + " since its idCompra field is not nullable.");
                }
            }
            for (KardexPEPS kardexPEPSCollectionOldKardexPEPS : kardexPEPSCollectionOld) {
                if (!kardexPEPSCollectionNew.contains(kardexPEPSCollectionOldKardexPEPS)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain KardexPEPS " + kardexPEPSCollectionOldKardexPEPS + " since its idCompra field is not nullable.");
                }
            }
            for (LibroCompra libroCompraCollectionOldLibroCompra : libroCompraCollectionOld) {
                if (!libroCompraCollectionNew.contains(libroCompraCollectionOldLibroCompra)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain LibroCompra " + libroCompraCollectionOldLibroCompra + " since its idCompra field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<DetalleCompra> attachedDetalleCompraCollectionNew = new ArrayList<DetalleCompra>();
            for (DetalleCompra detalleCompraCollectionNewDetalleCompraToAttach : detalleCompraCollectionNew) {
                detalleCompraCollectionNewDetalleCompraToAttach = em.getReference(detalleCompraCollectionNewDetalleCompraToAttach.getClass(), detalleCompraCollectionNewDetalleCompraToAttach.getId());
                attachedDetalleCompraCollectionNew.add(detalleCompraCollectionNewDetalleCompraToAttach);
            }
            detalleCompraCollectionNew = attachedDetalleCompraCollectionNew;
            compra.setDetalleCompraCollection(detalleCompraCollectionNew);
            Collection<KardexPEPS> attachedKardexPEPSCollectionNew = new ArrayList<KardexPEPS>();
            for (KardexPEPS kardexPEPSCollectionNewKardexPEPSToAttach : kardexPEPSCollectionNew) {
                kardexPEPSCollectionNewKardexPEPSToAttach = em.getReference(kardexPEPSCollectionNewKardexPEPSToAttach.getClass(), kardexPEPSCollectionNewKardexPEPSToAttach.getId());
                attachedKardexPEPSCollectionNew.add(kardexPEPSCollectionNewKardexPEPSToAttach);
            }
            kardexPEPSCollectionNew = attachedKardexPEPSCollectionNew;
            compra.setKardexPEPSCollection(kardexPEPSCollectionNew);
            Collection<LibroCompra> attachedLibroCompraCollectionNew = new ArrayList<LibroCompra>();
            for (LibroCompra libroCompraCollectionNewLibroCompraToAttach : libroCompraCollectionNew) {
                libroCompraCollectionNewLibroCompraToAttach = em.getReference(libroCompraCollectionNewLibroCompraToAttach.getClass(), libroCompraCollectionNewLibroCompraToAttach.getId());
                attachedLibroCompraCollectionNew.add(libroCompraCollectionNewLibroCompraToAttach);
            }
            libroCompraCollectionNew = attachedLibroCompraCollectionNew;
            compra.setLibroCompraCollection(libroCompraCollectionNew);
            compra = em.merge(compra);
            for (DetalleCompra detalleCompraCollectionNewDetalleCompra : detalleCompraCollectionNew) {
                if (!detalleCompraCollectionOld.contains(detalleCompraCollectionNewDetalleCompra)) {
                    Compra oldIdCompraOfDetalleCompraCollectionNewDetalleCompra = detalleCompraCollectionNewDetalleCompra.getIdCompra();
                    detalleCompraCollectionNewDetalleCompra.setIdCompra(compra);
                    detalleCompraCollectionNewDetalleCompra = em.merge(detalleCompraCollectionNewDetalleCompra);
                    if (oldIdCompraOfDetalleCompraCollectionNewDetalleCompra != null && !oldIdCompraOfDetalleCompraCollectionNewDetalleCompra.equals(compra)) {
                        oldIdCompraOfDetalleCompraCollectionNewDetalleCompra.getDetalleCompraCollection().remove(detalleCompraCollectionNewDetalleCompra);
                        oldIdCompraOfDetalleCompraCollectionNewDetalleCompra = em.merge(oldIdCompraOfDetalleCompraCollectionNewDetalleCompra);
                    }
                }
            }
            for (KardexPEPS kardexPEPSCollectionNewKardexPEPS : kardexPEPSCollectionNew) {
                if (!kardexPEPSCollectionOld.contains(kardexPEPSCollectionNewKardexPEPS)) {
                    Compra oldIdCompraOfKardexPEPSCollectionNewKardexPEPS = kardexPEPSCollectionNewKardexPEPS.getIdCompra();
                    kardexPEPSCollectionNewKardexPEPS.setIdCompra(compra);
                    kardexPEPSCollectionNewKardexPEPS = em.merge(kardexPEPSCollectionNewKardexPEPS);
                    if (oldIdCompraOfKardexPEPSCollectionNewKardexPEPS != null && !oldIdCompraOfKardexPEPSCollectionNewKardexPEPS.equals(compra)) {
                        oldIdCompraOfKardexPEPSCollectionNewKardexPEPS.getKardexPEPSCollection().remove(kardexPEPSCollectionNewKardexPEPS);
                        oldIdCompraOfKardexPEPSCollectionNewKardexPEPS = em.merge(oldIdCompraOfKardexPEPSCollectionNewKardexPEPS);
                    }
                }
            }
            for (LibroCompra libroCompraCollectionNewLibroCompra : libroCompraCollectionNew) {
                if (!libroCompraCollectionOld.contains(libroCompraCollectionNewLibroCompra)) {
                    Compra oldIdCompraOfLibroCompraCollectionNewLibroCompra = libroCompraCollectionNewLibroCompra.getIdCompra();
                    libroCompraCollectionNewLibroCompra.setIdCompra(compra);
                    libroCompraCollectionNewLibroCompra = em.merge(libroCompraCollectionNewLibroCompra);
                    if (oldIdCompraOfLibroCompraCollectionNewLibroCompra != null && !oldIdCompraOfLibroCompraCollectionNewLibroCompra.equals(compra)) {
                        oldIdCompraOfLibroCompraCollectionNewLibroCompra.getLibroCompraCollection().remove(libroCompraCollectionNewLibroCompra);
                        oldIdCompraOfLibroCompraCollectionNewLibroCompra = em.merge(oldIdCompraOfLibroCompraCollectionNewLibroCompra);
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
            Collection<DetalleCompra> detalleCompraCollectionOrphanCheck = compra.getDetalleCompraCollection();
            for (DetalleCompra detalleCompraCollectionOrphanCheckDetalleCompra : detalleCompraCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Compra (" + compra + ") cannot be destroyed since the DetalleCompra " + detalleCompraCollectionOrphanCheckDetalleCompra + " in its detalleCompraCollection field has a non-nullable idCompra field.");
            }
            Collection<KardexPEPS> kardexPEPSCollectionOrphanCheck = compra.getKardexPEPSCollection();
            for (KardexPEPS kardexPEPSCollectionOrphanCheckKardexPEPS : kardexPEPSCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Compra (" + compra + ") cannot be destroyed since the KardexPEPS " + kardexPEPSCollectionOrphanCheckKardexPEPS + " in its kardexPEPSCollection field has a non-nullable idCompra field.");
            }
            Collection<LibroCompra> libroCompraCollectionOrphanCheck = compra.getLibroCompraCollection();
            for (LibroCompra libroCompraCollectionOrphanCheckLibroCompra : libroCompraCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Compra (" + compra + ") cannot be destroyed since the LibroCompra " + libroCompraCollectionOrphanCheckLibroCompra + " in its libroCompraCollection field has a non-nullable idCompra field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
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
