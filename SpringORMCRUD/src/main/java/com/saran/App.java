package com.saran;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.saran.config.AppConfig;
import com.saran.model.Product;
import com.saran.service.ProductService;

public class App {

		public static void main(String[] args) {
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			ProductService service = (ProductService) context.getBean("prdService");
			Product p1 = new Product();
			p1.setPrId(1);
			p1.setProductName("Desktop");
			p1.setProductPrice(500);
			Product p2 = new Product();
			p2.setPrId(2);
			p2.setProductName("Laptop");
			p2.setProductPrice(1500);
			Product p3 = new Product();
			p3.setPrId(3);
			p3.setProductName("IPad");
			p3.setProductPrice(700);
			service.saveProduct(p1); service.saveProduct(p2); service.saveProduct(p3);
			List<Product> list = service.findAllProducts();
			list.forEach(System.out::println);
			service.deleteByProductId(1);
			Product prod = service.findById(2);
			prod.setProductPrice(new Integer(900));
			service.updateProduct(prod);
			
			
		}
}
