/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.autowire;

import com.aplose.formationspringjava.tpinjection.Dependency;

/**
 *
 * @author oandrade
 */
public class AutowireInjection {
    private Dependency dependency;

    public AutowireInjection() {
        System.out.println("Constructeur de AutowireInjection");
    }

    public Dependency getDependency() {
        return dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
    
}
