/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cunori.kardex.controller;

import cunori.kardex.controller.exceptions.IllegalOrphanException;
import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.controller.exceptions.PreexistingEntityException;
import cunori.kardex.dao.Gerente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import cunori.kardex.dao.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author hermas
 */
public class GerenteJpaController implements Serializable {

    public GerenteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Gerente gerente) throws IllegalOrphanException, PreexistingEntityException, Exception {
        List<String> illegalOrphanMessages = null;
        Persona personaOrphanCheck = gerente.getPersona();
        if (personaOrphanCheck != null) {
            Gerente oldGerenteOfPersona = personaOrphanCheck.getGerente();
            if (oldGerenteOfPersona != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Persona " + personaOrphanCheck + " already has an item of type Gerente whose persona column cannot be null. Please make another selection for the persona field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona = gerente.getPersona();
            if (persona != null) {
                persona = em.getReference(persona.getClass(), persona.getPersonaPK());
                gerente.setPersona(persona);
            }
            em.persist(gerente);
            if (persona != null) {
                persona.setGerente(gerente);
                persona = em.merge(persona);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findGerente(gerente.getId()) != null) {
                throw new PreexistingEntityException("Gerente " + gerente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Gerente gerente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Gerente persistentGerente = em.find(Gerente.class, gerente.getId());
            Persona personaOld = persistentGerente.getPersona();
            Persona personaNew = gerente.getPersona();
            List<String> illegalOrphanMessages = null;
            if (personaNew != null && !personaNew.equals(personaOld)) {
                Gerente oldGerenteOfPersona = personaNew.getGerente();
                if (oldGerenteOfPersona != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Persona " + personaNew + " already has an item of type Gerente whose persona column cannot be null. Please make another selection for the persona field.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (personaNew != null) {
                personaNew = em.getReference(personaNew.getClass(), personaNew.getPersonaPK());
                gerente.setPersona(personaNew);
            }
            gerente = em.merge(gerente);
            if (personaOld != null && !personaOld.equals(personaNew)) {
                personaOld.setGerente(null);
                personaOld = em.merge(personaOld);
            }
            if (personaNew != null && !personaNew.equals(personaOld)) {
                personaNew.setGerente(gerente);
                personaNew = em.merge(personaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = gerente.getId();
                if (findGerente(id) == null) {
                    throw new NonexistentEntityException("The gerente with id " + id + " no longer exists.");
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
            Gerente gerente;
            try {
                gerente = em.getReference(Gerente.class, id);
                gerente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The gerente with id " + id + " no longer exists.", enfe);
            }
            Persona persona = gerente.getPersona();
            if (persona != null) {
                persona.setGerente(null);
                persona = em.merge(persona);
            }
            em.remove(gerente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Gerente> findGerenteEntities() {
        return findGerenteEntities(true, -1, -1);
    }

    public List<Gerente> findGerenteEntities(int maxResults, int firstResult) {
        return findGerenteEntities(false, maxResults, firstResult);
    }

    private List<Gerente> findGerenteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Gerente.class));
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

    public Gerente findGerente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Gerente.class, id);
        } finally {
            em.close();
        }
    }

    public int getGerenteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Gerente> rt = cq.from(Gerente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
