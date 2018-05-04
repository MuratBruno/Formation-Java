/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author oandrade
 */
public class WriteBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("before method : "+method.getName());
    }
    
}
