/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.inheritance;

import com.aplose.formationspringjava.tpinjection.Dependency;
import com.aplose.formationspringjava.tpinjection.SetterInjection;

/**
 *
 * @author oandrade
 */
public class SetterInjection2 extends SetterInjection{
    private String name;

    public SetterInjection2() {
        System.out.println("Constructeur de SetterInjection2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
