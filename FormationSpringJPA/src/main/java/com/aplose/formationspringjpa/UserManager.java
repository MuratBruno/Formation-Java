/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjpa;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author oandrade
 */
public interface UserManager {
    public void setEm(EntityManager em);
    public User findUserByName(String name);
    public User findById(int id);
    public List<User> findAll();
    public void save(User u);
    public void delete(User u);
}
