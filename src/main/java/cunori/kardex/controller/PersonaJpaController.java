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
import cunori.kardex.dao.Cliente;
import cunori.kardex.dao.Administrador;
import cunori.kardex.dao.Vendedor;
import cunori.kardex.dao.Gerente;
import cunori.kardex.dao.Persona;
import cunori.kardex.dao.PersonaPK;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author hermas
 */
public class PersonaJpaController implements Serializable {

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) throws PreexistingEntityException, Exception {
        if (persona.getPersonaPK() == null) {
            persona.setPersonaPK(new PersonaPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = persona.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getId());
                persona.setCliente(cliente);
            }
            Administrador administrador = persona.getAdministrador();
            if (administrador != null) {
                administrador = em.getReference(administrador.getClass(), administrador.getId());
                persona.setAdministrador(administrador);
            }
            Vendedor vendedor = persona.getVendedor();
            if (vendedor != null) {
                vendedor = em.getReference(vendedor.getClass(), vendedor.getId());
                persona.setVendedor(vendedor);
            }
            Gerente gerente = persona.getGerente();
            if (gerente != null) {
                gerente = em.getReference(gerente.getClass(), gerente.getId());
                persona.setGerente(gerente);
            }
            em.persist(persona);
            if (cliente != null) {
                Persona oldPersonaOfCliente = cliente.getPersona();
                if (oldPersonaOfCliente != null) {
                    oldPersonaOfCliente.setCliente(null);
                    oldPersonaOfCliente = em.merge(oldPersonaOfCliente);
                }
                cliente.setPersona(persona);
                cliente = em.merge(cliente);
            }
            if (administrador != null) {
                Persona oldPersonaOfAdministrador = administrador.getPersona();
                if (oldPersonaOfAdministrador != null) {
                    oldPersonaOfAdministrador.setAdministrador(null);
                    oldPersonaOfAdministrador = em.merge(oldPersonaOfAdministrador);
                }
                administrador.setPersona(persona);
                administrador = em.merge(administrador);
            }
            if (vendedor != null) {
                Persona oldPersonaOfVendedor = vendedor.getPersona();
                if (oldPersonaOfVendedor != null) {
                    oldPersonaOfVendedor.setVendedor(null);
                    oldPersonaOfVendedor = em.merge(oldPersonaOfVendedor);
                }
                vendedor.setPersona(persona);
                vendedor = em.merge(vendedor);
            }
            if (gerente != null) {
                Persona oldPersonaOfGerente = gerente.getPersona();
                if (oldPersonaOfGerente != null) {
                    oldPersonaOfGerente.setGerente(null);
                    oldPersonaOfGerente = em.merge(oldPersonaOfGerente);
                }
                gerente.setPersona(persona);
                gerente = em.merge(gerente);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getPersonaPK()) != null) {
                throw new PreexistingEntityException("Persona " + persona + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getPersonaPK());
            Cliente clienteOld = persistentPersona.getCliente();
            Cliente clienteNew = persona.getCliente();
            Administrador administradorOld = persistentPersona.getAdministrador();
            Administrador administradorNew = persona.getAdministrador();
            Vendedor vendedorOld = persistentPersona.getVendedor();
            Vendedor vendedorNew = persona.getVendedor();
            Gerente gerenteOld = persistentPersona.getGerente();
            Gerente gerenteNew = persona.getGerente();
            List<String> illegalOrphanMessages = null;
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Cliente " + clienteOld + " since its persona field is not nullable.");
            }
            if (administradorOld != null && !administradorOld.equals(administradorNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Administrador " + administradorOld + " since its persona field is not nullable.");
            }
            if (vendedorOld != null && !vendedorOld.equals(vendedorNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Vendedor " + vendedorOld + " since its persona field is not nullable.");
            }
            if (gerenteOld != null && !gerenteOld.equals(gerenteNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Gerente " + gerenteOld + " since its persona field is not nullable.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getId());
                persona.setCliente(clienteNew);
            }
            if (administradorNew != null) {
                administradorNew = em.getReference(administradorNew.getClass(), administradorNew.getId());
                persona.setAdministrador(administradorNew);
            }
            if (vendedorNew != null) {
                vendedorNew = em.getReference(vendedorNew.getClass(), vendedorNew.getId());
                persona.setVendedor(vendedorNew);
            }
            if (gerenteNew != null) {
                gerenteNew = em.getReference(gerenteNew.getClass(), gerenteNew.getId());
                persona.setGerente(gerenteNew);
            }
            persona = em.merge(persona);
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                Persona oldPersonaOfCliente = clienteNew.getPersona();
                if (oldPersonaOfCliente != null) {
                    oldPersonaOfCliente.setCliente(null);
                    oldPersonaOfCliente = em.merge(oldPersonaOfCliente);
                }
                clienteNew.setPersona(persona);
                clienteNew = em.merge(clienteNew);
            }
            if (administradorNew != null && !administradorNew.equals(administradorOld)) {
                Persona oldPersonaOfAdministrador = administradorNew.getPersona();
                if (oldPersonaOfAdministrador != null) {
                    oldPersonaOfAdministrador.setAdministrador(null);
                    oldPersonaOfAdministrador = em.merge(oldPersonaOfAdministrador);
                }
                administradorNew.setPersona(persona);
                administradorNew = em.merge(administradorNew);
            }
            if (vendedorNew != null && !vendedorNew.equals(vendedorOld)) {
                Persona oldPersonaOfVendedor = vendedorNew.getPersona();
                if (oldPersonaOfVendedor != null) {
                    oldPersonaOfVendedor.setVendedor(null);
                    oldPersonaOfVendedor = em.merge(oldPersonaOfVendedor);
                }
                vendedorNew.setPersona(persona);
                vendedorNew = em.merge(vendedorNew);
            }
            if (gerenteNew != null && !gerenteNew.equals(gerenteOld)) {
                Persona oldPersonaOfGerente = gerenteNew.getPersona();
                if (oldPersonaOfGerente != null) {
                    oldPersonaOfGerente.setGerente(null);
                    oldPersonaOfGerente = em.merge(oldPersonaOfGerente);
                }
                gerenteNew.setPersona(persona);
                gerenteNew = em.merge(gerenteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                PersonaPK id = persona.getPersonaPK();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(PersonaPK id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getPersonaPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Cliente clienteOrphanCheck = persona.getCliente();
            if (clienteOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Persona (" + persona + ") cannot be destroyed since the Cliente " + clienteOrphanCheck + " in its cliente field has a non-nullable persona field.");
            }
            Administrador administradorOrphanCheck = persona.getAdministrador();
            if (administradorOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Persona (" + persona + ") cannot be destroyed since the Administrador " + administradorOrphanCheck + " in its administrador field has a non-nullable persona field.");
            }
            Vendedor vendedorOrphanCheck = persona.getVendedor();
            if (vendedorOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Persona (" + persona + ") cannot be destroyed since the Vendedor " + vendedorOrphanCheck + " in its vendedor field has a non-nullable persona field.");
            }
            Gerente gerenteOrphanCheck = persona.getGerente();
            if (gerenteOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Persona (" + persona + ") cannot be destroyed since the Gerente " + gerenteOrphanCheck + " in its gerente field has a non-nullable persona field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
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

    public Persona findPersona(PersonaPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
