/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oandrade
 */
@Service("userManager")
public class UserManagerImpl implements UserManager {

    @PersistenceContext
    EntityManager em; // injection de l'entitymanager

    @Override
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public User findById(int id) {
        return em.find(User.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        List<User> users = em.createNamedQuery("User.findAll",
                User.class).getResultList();
        return users;
    }

    @Transactional
    @Override
    public void save(User u) {
        em.merge(u);
//        em.persist(u);
    }

    @Override
    public void delete(User u) {
        em.remove(u);
    }
}
