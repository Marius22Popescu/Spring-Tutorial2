package com.saran.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterMethodAdvice implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Method called after the bussines logic");
		
	}

}
