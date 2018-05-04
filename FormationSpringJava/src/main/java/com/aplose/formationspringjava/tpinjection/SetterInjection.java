/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.tpinjection;

/**
 *
 * @author oandrade
 */
public class SetterInjection {
    private Dependency dependency;
    public SetterInjection(){
        System.out.println("Constructeur de SetterInjection");
    }
    public void setDependency(Dependency dependency){
        System.out.println("setDependency de SetterInjection");
        this.dependency = dependency;
    }

    public Dependency getDependency() {
        return dependency;
    }

}
