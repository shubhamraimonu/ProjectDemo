package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.Entity.Product;
import com.service.Service;

@Controller
public class Controller_class {

	@Autowired
	Service service;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Controller_class() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView name(@PathVariable("id") int id,HttpServletRequest request) {
		RedirectView redirectView=new RedirectView();
		System.out.println("ID is going to be deleted "+id);
		service.deleteProduct(id);
	redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
	}
	
	@RequestMapping("/update_form/{id}")
	public RedirectView updateProduct(@PathVariable("id") int id, @ModelAttribute("product") Product product,HttpServletRequest request) {
		
		System.out.println("id is getting  "+product.getId());
		product.setId(id);
		System.out.println("id is getting  "+product.getId());
		String string=service.updatedetail_service(product);
		
	RedirectView redirectView=new RedirectView();
		
	
		System.out.println("Request "+ request.getContextPath());
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
		
		
		
	
	}
	
	@RequestMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id,Model model) {
		
		
		System.out.println("came to the updation of product   "+id);
		Product product=service.getSingleServiceProduct(id);
		
		model.addAttribute("product",product);
		
		
		return "form";
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Product> products=service.getAllProducts();
		
		model.addAttribute("products", products);

		return "index"; 
	}
	
	
	
	
	@RequestMapping("/register")
	public String createUser() {
		
		return "form";
	}
	
	@RequestMapping("/handle_form")
	public RedirectView Handle_form(  @ModelAttribute("product") Product product,BindingResult result,HttpServletRequest request,HttpSession session)	
	{
		System.out.println(product);
		service.InsertServiceUser(product);
		
		RedirectView redirectView=new RedirectView();
		
		System.out.println("Servlet context"+session.getServletContext());
		
		System.out.println("Request "+ request.getContextPath());
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
	}
	
	

}
