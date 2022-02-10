package com.ProductDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.Product;

@Repository
public class ProductDao {

	@Autowired
private HibernateTemplate  template;
	
	public ProductDao() {
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public String UpdateDetail(Product product) {
	
		template.update(product);
		
		return "updated";
		
	}
	
	@Transactional
	public Product getSingleProduct(int id) {
		System.out.println("cam r to thw product signle method");
		
		Product product=template.load(Product.class, id);
		System.out.println(product);
		return product;
	}
	
	public List<Product>getAllProducts() {
		List<Product> products =template.loadAll(Product.class);
		
		return products;
		
	}
	@Transactional
	public String deleteProduct(int id) {
		Product product=template.load(Product.class, id);
		template.delete(product);
		return "deleted successfully";
	}
	
	
	@Transactional
	public int insertUser(Product product) {
		
		int id=(Integer) template.save(product);
		
		return id;
	}

}
