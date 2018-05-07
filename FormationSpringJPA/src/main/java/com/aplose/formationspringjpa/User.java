/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Olivier Andrade - Aplose
 */
@Entity
@Table(name = "T_USER")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "select u from User u"),
    @NamedQuery(name = "User.findById", query = "select distinct u from User u where u.id = :id"),
    @NamedQuery(name = "User.findByName", query = "select u from User u where u.lastname = :lastname")
})
public class User {

    public User() {
        System.out.println("Contructeur de User");
    }
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull(message = "Le login ne peut pas être vide")
    @Size(min = 2, max = 60)
    private String login;
    @NotNull(message = "Le mot de passe ne peut pas être vide")
    @Size(min = 2, max = 60)
    private String pwd;

    @AssertTrue(message = "Le login doit être un email valide")
    public boolean isValidLogin() {
        return (login != null && login.contains("@"));
    }
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
