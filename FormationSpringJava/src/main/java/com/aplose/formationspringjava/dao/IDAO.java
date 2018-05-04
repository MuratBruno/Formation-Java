/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.dao;

import java.util.List;

/**
 *
 * @author oandrade
 */
public interface IDAO<T> {
  public void create(T obj);
  public void delete(T obj);
  public void update(T obj);
  public T find(int id);
  public List<T> findAll();
}
