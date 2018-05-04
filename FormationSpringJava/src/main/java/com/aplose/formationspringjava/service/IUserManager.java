/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.service;

import com.aplose.formationspringjava.model.User;
import java.util.List;

/**
 *
 * @author oandrade
 */
public interface IUserManager {
    public void createUser(User u);
    public void updateUser(User u);
    public void removeUser(User u);
    public User getUserByLoginAndPassword(String login, String password);
    List<User> getUsers();
}
