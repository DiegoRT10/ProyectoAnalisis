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
import cunori.kardex.dao.LibroCompra;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diego Ramos
 */
public class LibroCompraJpaController implements Serializable {

    public LibroCompraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LibroCompra libroCompra) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compra idCompra = libroCompra.getIdCompra();
            if (idCompra != null) {
                idCompra = em.getReference(idCompra.getClass(), idCompra.getId());
                libroCompra.setIdCompra(idCompra);
            }
            em.persist(libroCompra);
            if (idCompra != null) {
                idCompra.getLibroCompraCollection().add(libroCompra);
                idCompra = em.merge(idCompra);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLibroCompra(libroCompra.getId()) != null) {
                throw new PreexistingEntityException("LibroCompra " + libroCompra + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LibroCompra libroCompra) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LibroCompra persistentLibroCompra = em.find(LibroCompra.class, libroCompra.getId());
            Compra idCompraOld = persistentLibroCompra.getIdCompra();
            Compra idCompraNew = libroCompra.getIdCompra();
            if (idCompraNew != null) {
                idCompraNew = em.getReference(idCompraNew.getClass(), idCompraNew.getId());
                libroCompra.setIdCompra(idCompraNew);
            }
            libroCompra = em.merge(libroCompra);
            if (idCompraOld != null && !idCompraOld.equals(idCompraNew)) {
                idCompraOld.getLibroCompraCollection().remove(libroCompra);
                idCompraOld = em.merge(idCompraOld);
            }
            if (idCompraNew != null && !idCompraNew.equals(idCompraOld)) {
                idCompraNew.getLibroCompraCollection().add(libroCompra);
                idCompraNew = em.merge(idCompraNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = libroCompra.getId();
                if (findLibroCompra(id) == null) {
                    throw new NonexistentEntityException("The libroCompra with id " + id + " no longer exists.");
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
            LibroCompra libroCompra;
            try {
                libroCompra = em.getReference(LibroCompra.class, id);
                libroCompra.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The libroCompra with id " + id + " no longer exists.", enfe);
            }
            Compra idCompra = libroCompra.getIdCompra();
            if (idCompra != null) {
                idCompra.getLibroCompraCollection().remove(libroCompra);
                idCompra = em.merge(idCompra);
            }
            em.remove(libroCompra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LibroCompra> findLibroCompraEntities() {
        return findLibroCompraEntities(true, -1, -1);
    }

    public List<LibroCompra> findLibroCompraEntities(int maxResults, int firstResult) {
        return findLibroCompraEntities(false, maxResults, firstResult);
    }

    private List<LibroCompra> findLibroCompraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LibroCompra.class));
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

    public LibroCompra findLibroCompra(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LibroCompra.class, id);
        } finally {
            em.close();
        }
    }

    public int getLibroCompraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LibroCompra> rt = cq.from(LibroCompra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
