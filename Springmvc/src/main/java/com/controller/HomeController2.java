package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.Entity.Form;
import com.service.Service;

@Controller
public class HomeController2 {

	@Autowired
	Service service;
	
	public HomeController2() {
		// TODO Auto-generated constructor stub
		
	}
	
	@ModelAttribute("formss")
	public Form getForm() {
		
		System.out.println("coming int model attribures forst");
		Form form=new Form();
		
		form.setEmail("da");
		form.setPassword("dd");
		form.setCheck("checking");
		
		return form;
		
	}
	
	@RequestMapping("log")
	public ModelAndView getForm( @ModelAttribute("formss") Form form) {
		
		System.out.println(form.getEmail());
		

		int id=service.saveUser(form);
		System.out.println(id);
		
		/*
		 * RedirectView redirectView=new RedirectView(); redirectView.setUrl("about");
		 * 
		 */
		
		
		/*
		 * RedirectView redirectView=new RedirectView();
		 * redirectView.setUrl("https://www.google.com/search?q="+form.getEmail());
		 */
		
		  ModelAndView modelAndView=new ModelAndView();
		  modelAndView.setViewName("/about");
		 
		 System.out.println("no model viw");
	
		return  modelAndView ;
	}

}
