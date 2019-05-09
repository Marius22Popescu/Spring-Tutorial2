package com.saran.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.saran.model.Product;

@Repository("productDAO")
public class ProductDAOImpl extends AbstractDAO implements ProductDAO{

	
	public void saveProduct(Product prod) {
		persist(prod);
		
	}

	
	public List<Product> findAllProducts() {
		Criteria criteria = getSession().createCriteria(Product.class);
		return criteria.list();
	}

	public void deleteByProductId(int prdId) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eqOrIsNull("prId", prdId));
	}

	public void updateProduct(Product prod) {
		getSession().update(prod);
		
	}


	
	public Product findById(int prdId) {
		Criteria criteria = getSession().createCriteria(Product.class);
        criteria.add(Restrictions.eq("prdId", prdId));
        
        return (Product)criteria.uniqueResult();
	}

}
