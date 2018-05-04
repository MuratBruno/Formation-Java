package com.aplose.spring.app;

import java.lang.reflect.Method;
import java.time.Instant;

import org.springframework.aop.AfterReturningAdvice;

public class AfterReturning implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("after method : " + method.getName() + " "  + Instant.now());
	}

}
