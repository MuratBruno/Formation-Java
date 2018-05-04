/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author oandrade
 */
public class SpringAware implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, InitializingBean, DisposableBean{
    private String beanName;
    private ClassLoader classLoader;
    private ApplicationContext ac;
    @Override
    public void setBeanName(String beanName) {
        this.beanName=beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader=classLoader;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.ac=ac;
    }

    public ApplicationContext getAc() {
        return ac;
    }
    @PostConstruct
    public void postConstructMethod(){
        System.out.println("In post construct method of SpringAware bean !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet method of SpringAware bean !");
    }
    
    public void initMethod(){
        System.out.println("In initMethod of SpringAware bean !");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("In preDestroy method of SpringAware bean !");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("In destroy method of SpringAware bean !");
    }
    
    public void destroyMethod() throws Exception {
        System.out.println("In destroyMethod method of SpringAware bean !");
    }
    
}
