package com.aplose.spring.app;

import java.lang.reflect.Method;
import java.time.Instant;

import org.springframework.aop.MethodBeforeAdvice;

public class WriteBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before method : " + method.getName() + " " + Instant.now());

	}

}
