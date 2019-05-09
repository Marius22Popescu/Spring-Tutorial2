package com.saran.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;




public class AroundAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Method Name " +invocation.getMethod().getName());
		
		System.out.println("Method Arguments"+invocation.getArguments());
		
		try {
			Object result = invocation.proceed();
			System.out.println("B4 the bussiness logic");
			return result;
		}catch(IllegalArgumentException e) {e.printStackTrace();
		System.out.println("Throws Exception");throw e;}  
		
	}

}
