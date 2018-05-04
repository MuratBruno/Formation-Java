/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.tpinjection;

/**
 *
 * @author oandrade
 */
public class ConstructorInjection {
    private Dependency dependency;
    public ConstructorInjection(Dependency dependency){
        System.out.println("constructeur de ConstructorInjection");
        this.dependency = dependency;
    }

    public Dependency getDependency() {
        return dependency;
    }
    
}
