package com.saran.springAOP2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saran.service.ProductService;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("product.xml");
       ProductService p1 = (ProductService)ctx.getBean("productServiceProxy");
       System.out.println(p1.getPrdId());
       System.out.println(p1.getPrdName());
       p1.printThrowsExceptions();
    }
}
