/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author oandrade
 */
public class WriteAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        System.out.println("after method : "+method.getName());
    }
    
}
