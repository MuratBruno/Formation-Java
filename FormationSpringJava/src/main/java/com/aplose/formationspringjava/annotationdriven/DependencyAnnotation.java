/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.annotationdriven;

import com.aplose.formationspringjava.tpinjection.Dependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author oandrade
*/
@Component
public class DependencyAnnotation {
    private String name = "DependencyAnnotation Component";
    @Autowired
    private Dependency dependency;

    public DependencyAnnotation() {
        System.out.println("Constructeur de DependencyAnnotation");
    }
    

  /*  public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }*/

    public Dependency getDependency() {
        return dependency;
    }
    

    public String getName() {
        return name;
    }
    
}
