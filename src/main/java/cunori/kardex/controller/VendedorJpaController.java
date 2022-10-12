/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import cunori.kardex.dao.Persona;
import cunori.kardex.dao.Vendedor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author hermas
 */
public class VendedorJpaController implements Serializable {

    public VendedorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Vendedor vendedor) throws IllegalOrphanException, PreexistingEntityException, Exception {
        List<String> illegalOrphanMessages = null;
        Persona personaOrphanCheck = vendedor.getPersona();
        if (personaOrphanCheck != null) {
            Vendedor oldVendedorOfPersona = personaOrphanCheck.getVendedor();
            if (oldVendedorOfPersona != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Persona " + personaOrphanCheck + " already has an item of type Vendedor whose persona column cannot be null. Please make another selection for the persona field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona = vendedor.getPersona();
            if (persona != null) {
                persona = em.getReference(persona.getClass(), persona.getPersonaPK());
                vendedor.setPersona(persona);
            }
            em.persist(vendedor);
            if (persona != null) {
                persona.setVendedor(vendedor);
                persona = em.merge(persona);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVendedor(vendedor.getId()) != null) {
                throw new PreexistingEntityException("Vendedor " + vendedor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Vendedor vendedor) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Vendedor persistentVendedor = em.find(Vendedor.class, vendedor.getId());
            Persona personaOld = persistentVendedor.getPersona();
            Persona personaNew = vendedor.getPersona();
            List<String> illegalOrphanMessages = null;
            if (personaNew != null && !personaNew.equals(personaOld)) {
                Vendedor oldVendedorOfPersona = personaNew.getVendedor();
                if (oldVendedorOfPersona != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Persona " + personaNew + " already has an item of type Vendedor whose persona column cannot be null. Please make another selection for the persona field.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (personaNew != null) {
                personaNew = em.getReference(personaNew.getClass(), personaNew.getPersonaPK());
                vendedor.setPersona(personaNew);
            }
            vendedor = em.merge(vendedor);
            if (personaOld != null && !personaOld.equals(personaNew)) {
                personaOld.setVendedor(null);
                personaOld = em.merge(personaOld);
            }
            if (personaNew != null && !personaNew.equals(personaOld)) {
                personaNew.setVendedor(vendedor);
                personaNew = em.merge(personaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = vendedor.getId();
                if (findVendedor(id) == null) {
                    throw new NonexistentEntityException("The vendedor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Vendedor vendedor;
            try {
                vendedor = em.getReference(Vendedor.class, id);
                vendedor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The vendedor with id " + id + " no longer exists.", enfe);
            }
            Persona persona = vendedor.getPersona();
            if (persona != null) {
                persona.setVendedor(null);
                persona = em.merge(persona);
            }
            em.remove(vendedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Vendedor> findVendedorEntities() {
        return findVendedorEntities(true, -1, -1);
    }

    public List<Vendedor> findVendedorEntities(int maxResults, int firstResult) {
        return findVendedorEntities(false, maxResults, firstResult);
    }

    private List<Vendedor> findVendedorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Vendedor.class));
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

    public Vendedor findVendedor(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Vendedor.class, id);
        } finally {
            em.close();
        }
    }

    public int getVendedorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Vendedor> rt = cq.from(Vendedor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
