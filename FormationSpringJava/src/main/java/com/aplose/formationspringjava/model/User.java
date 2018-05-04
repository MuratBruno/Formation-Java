/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aplose.formationspringjava.model;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class User {
    public User(){
                System.out.println("Contructeur de User");
    }
    private Integer id;
     
   private String login;
    private String pwd;
    private String lastname;
    private String firstname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}
