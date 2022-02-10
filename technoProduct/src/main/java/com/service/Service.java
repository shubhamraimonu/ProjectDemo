package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Entity.Product;
import com.ProductDao.ProductDao;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	ProductDao productDao;

	public Service() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String  updatedetail_service(Product product) {
		String msgString=productDao.UpdateDetail(product);
		
		return msgString;
		
	}
	
	public List<Product> getAllProducts() {
		
		List<Product> products=productDao.getAllProducts();
		return products;
		
	}
	
	public String deleteProduct(int id) {
		productDao.deleteProduct(id);
		
		return "succesfully deleted";
		
	}
	
	public Product getSingleServiceProduct(int id) {
		Product product=productDao.getSingleProduct(id);
		System.out.println(product);
		
		return product;
	}
	
	
	public int InsertServiceUser(Product product) {
		
		int id=productDao.insertUser(product);
		return id;
		
	}

}
