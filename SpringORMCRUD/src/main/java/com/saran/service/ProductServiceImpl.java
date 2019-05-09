package com.saran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saran.DAO.*;
import com.saran.model.Product;

@Service("prdService")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO dao;

	public void saveProduct(Product prod) {
	dao.saveProduct(prod);
	}


	public List<Product> findAllProducts() {

		return dao.findAllProducts();
	}


	public void deleteByProductId(int prdId) {
	dao.deleteByProductId(prdId);
		}

	
	public void updateProduct(Product prod) {
		dao.updateProduct(prod);
				
	}

	
	public Product findById(int prdId) {
		
		return dao.findById(prdId);
	}

}
