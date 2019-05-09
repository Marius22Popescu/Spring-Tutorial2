package com.saran.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class B4MethodAdvice implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(" method called b4 the bussines logic");
		
	}

}
