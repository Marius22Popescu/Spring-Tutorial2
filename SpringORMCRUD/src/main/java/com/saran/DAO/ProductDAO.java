package com.saran.DAO;

import java.util.List;

import com.saran.model.Product;

public interface ProductDAO {
	
	void saveProduct(Product prod);
	List<Product> findAllProducts();
	void deleteByProductId(int prdId);
	void updateProduct(Product prod);
	Product findById(int prdId);
}
