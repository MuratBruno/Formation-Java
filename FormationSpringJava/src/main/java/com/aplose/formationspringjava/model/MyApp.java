/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aplose.formationspringjava.model;

import java.util.List;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class MyApp {
    public MyApp(){
        System.out.println("Contructeur de MyApp");
    }
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
