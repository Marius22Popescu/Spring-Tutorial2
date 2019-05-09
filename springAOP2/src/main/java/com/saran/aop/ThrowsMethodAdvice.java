package com.saran.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsMethodAdvice implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException e)
		throws Throwable{
		System.out.println("Throws IllegalArgumentException");
	}

}
