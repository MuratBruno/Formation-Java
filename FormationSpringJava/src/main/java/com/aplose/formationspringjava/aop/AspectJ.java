/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author oandrade
 */
@Component
@Aspect
public class AspectJ {
    @Pointcut("execution(public void com.aplose.formationspringjava.aop.ConsoleWriter.write(String)) && args(message)")
    public void writeExecution(String message){}
    @Before("writeExecution(message)")
    public void beforeWrite(JoinPoint joinPoint, String message){
        System.out.println("AspectJ beforeWrite method... : "+message);
    }
}
