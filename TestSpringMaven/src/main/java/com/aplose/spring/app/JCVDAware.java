package com.aplose.spring.app;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JCVDAware implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("DESTROYYYYYYYYYYYYYYYeru");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AFTER PROPERTIES SETTTeru");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("SET APPLICATION CONTEXTTTeru");
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println("BEAN : " + name);
		}
	}

	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		System.out.println("SET BEAN CLASS LOADERRRReru");
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("SET BEAN NAMEEEEEEEeru : "+ name);
	}
	
}