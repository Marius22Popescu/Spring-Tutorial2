package com.saran.service;

import java.util.List;

import com.saran.model.Product;

public interface ProductService {
	void saveProduct(Product prod);
	Product findById(int prdId);
	List<Product> findAllProducts();
	void deleteByProductId(int prId);
	void updateProduct(Product prod);

}
