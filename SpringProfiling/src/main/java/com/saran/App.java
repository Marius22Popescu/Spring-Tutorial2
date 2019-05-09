package com.saran;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		ctx.getEnvironment().setActiveProfiles("Dev");
		ctx.scan("com.saran");
		ctx.refresh(); ctx.close();
	}
}
