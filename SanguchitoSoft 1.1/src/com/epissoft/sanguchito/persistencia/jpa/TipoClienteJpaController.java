/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epissoft.sanguchito.persistencia.jpa;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.epissoft.sanguchito.persistencia.Cliente;
import com.epissoft.sanguchito.persistencia.TipoCliente;
import com.epissoft.sanguchito.persistencia.jpa.exceptions.IllegalOrphanException;
import com.epissoft.sanguchito.persistencia.jpa.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Hisae Shizumaru
 */
public class TipoClienteJpaController implements Serializable {

    public TipoClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoCliente tipoCliente) {
        if (tipoCliente.getClienteCollection() == null) {
            tipoCliente.setClienteCollection(new ArrayList<Cliente>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Cliente> attachedClienteCollection = new ArrayList<Cliente>();
            for (Cliente clienteCollectionClienteToAttach : tipoCliente.getClienteCollection()) {
                clienteCollectionClienteToAttach = em.getReference(clienteCollectionClienteToAttach.getClass(), clienteCollectionClienteToAttach.getClieDni());
                attachedClienteCollection.add(clienteCollectionClienteToAttach);
            }
            tipoCliente.setClienteCollection(attachedClienteCollection);
            em.persist(tipoCliente);
            for (Cliente clienteCollectionCliente : tipoCliente.getClienteCollection()) {
                TipoCliente oldTipClieCodOfClienteCollectionCliente = clienteCollectionCliente.getTipClieCod();
                clienteCollectionCliente.setTipClieCod(tipoCliente);
                clienteCollectionCliente = em.merge(clienteCollectionCliente);
                if (oldTipClieCodOfClienteCollectionCliente != null) {
                    oldTipClieCodOfClienteCollectionCliente.getClienteCollection().remove(clienteCollectionCliente);
                    oldTipClieCodOfClienteCollectionCliente = em.merge(oldTipClieCodOfClienteCollectionCliente);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoCliente tipoCliente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoCliente persistentTipoCliente = em.find(TipoCliente.class, tipoCliente.getTipClieCod());
            Collection<Cliente> clienteCollectionOld = persistentTipoCliente.getClienteCollection();
            Collection<Cliente> clienteCollectionNew = tipoCliente.getClienteCollection();
            List<String> illegalOrphanMessages = null;
            for (Cliente clienteCollectionOldCliente : clienteCollectionOld) {
                if (!clienteCollectionNew.contains(clienteCollectionOldCliente)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Cliente " + clienteCollectionOldCliente + " since its tipClieCod field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Cliente> attachedClienteCollectionNew = new ArrayList<Cliente>();
            for (Cliente clienteCollectionNewClienteToAttach : clienteCollectionNew) {
                clienteCollectionNewClienteToAttach = em.getReference(clienteCollectionNewClienteToAttach.getClass(), clienteCollectionNewClienteToAttach.getClieDni());
                attachedClienteCollectionNew.add(clienteCollectionNewClienteToAttach);
            }
            clienteCollectionNew = attachedClienteCollectionNew;
            tipoCliente.setClienteCollection(clienteCollectionNew);
            tipoCliente = em.merge(tipoCliente);
            for (Cliente clienteCollectionNewCliente : clienteCollectionNew) {
                if (!clienteCollectionOld.contains(clienteCollectionNewCliente)) {
                    TipoCliente oldTipClieCodOfClienteCollectionNewCliente = clienteCollectionNewCliente.getTipClieCod();
                    clienteCollectionNewCliente.setTipClieCod(tipoCliente);
                    clienteCollectionNewCliente = em.merge(clienteCollectionNewCliente);
                    if (oldTipClieCodOfClienteCollectionNewCliente != null && !oldTipClieCodOfClienteCollectionNewCliente.equals(tipoCliente)) {
                        oldTipClieCodOfClienteCollectionNewCliente.getClienteCollection().remove(clienteCollectionNewCliente);
                        oldTipClieCodOfClienteCollectionNewCliente = em.merge(oldTipClieCodOfClienteCollectionNewCliente);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoCliente.getTipClieCod();
                if (findTipoCliente(id) == null) {
                    throw new NonexistentEntityException("The tipoCliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoCliente tipoCliente;
            try {
                tipoCliente = em.getReference(TipoCliente.class, id);
                tipoCliente.getTipClieCod();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoCliente with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Cliente> clienteCollectionOrphanCheck = tipoCliente.getClienteCollection();
            for (Cliente clienteCollectionOrphanCheckCliente : clienteCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This TipoCliente (" + tipoCliente + ") cannot be destroyed since the Cliente " + clienteCollectionOrphanCheckCliente + " in its clienteCollection field has a non-nullable tipClieCod field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(tipoCliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoCliente> findTipoClienteEntities() {
        return findTipoClienteEntities(true, -1, -1);
    }

    public List<TipoCliente> findTipoClienteEntities(int maxResults, int firstResult) {
        return findTipoClienteEntities(false, maxResults, firstResult);
    }

    private List<TipoCliente> findTipoClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoCliente.class));
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

    public TipoCliente findTipoCliente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoCliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoCliente> rt = cq.from(TipoCliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
