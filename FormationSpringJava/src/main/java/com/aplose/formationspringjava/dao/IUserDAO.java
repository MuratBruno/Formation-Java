/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.dao;

import com.aplose.formationspringjava.model.User;

/**
 *
 * @author oandrade
 */
public interface IUserDAO extends IDAO<User> {
      public User findByLoginAndPassword(String login, String pwd);
}
