/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import cunori.kardex.dao.LibroVenta;
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
public class LibroVentaJpaController implements Serializable {

    public LibroVentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LibroVenta libroVenta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(libroVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLibroVenta(libroVenta.getId()) != null) {
                throw new PreexistingEntityException("LibroVenta " + libroVenta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LibroVenta libroVenta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            libroVenta = em.merge(libroVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = libroVenta.getId();
                if (findLibroVenta(id) == null) {
                    throw new NonexistentEntityException("The libroVenta with id " + id + " no longer exists.");
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
            LibroVenta libroVenta;
            try {
                libroVenta = em.getReference(LibroVenta.class, id);
                libroVenta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The libroVenta with id " + id + " no longer exists.", enfe);
            }
            em.remove(libroVenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LibroVenta> findLibroVentaEntities() {
        return findLibroVentaEntities(true, -1, -1);
    }

    public List<LibroVenta> findLibroVentaEntities(int maxResults, int firstResult) {
        return findLibroVentaEntities(false, maxResults, firstResult);
    }

    private List<LibroVenta> findLibroVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LibroVenta.class));
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

    public LibroVenta findLibroVenta(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LibroVenta.class, id);
        } finally {
            em.close();
        }
    }

    public int getLibroVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LibroVenta> rt = cq.from(LibroVenta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
