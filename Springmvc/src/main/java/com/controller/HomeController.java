package com.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Authenticator.RequestorType;
import java.net.BindException;
import java.nio.file.Path;
import java.security.KeyStore.Entry.Attribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.FormSubmitEvent.MethodType;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.Entity.Form;


@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping("/file")
	public  String fileForm() {
		
		return 
				"fileForm";
		
	}
	
	@RequestMapping(  value  =  "/upload",method = RequestMethod.POST)
	public  String  uploading(@ModelAttribute("files")   com.Entity.File files,BindingResult result,HttpSession session,Model model) throws IllegalStateException, IOException {
		
		
		if(result.hasErrors()) {
			System.out.println("has error --------------------------------");
			return "fileForm";
		}
		System.out.println("sdsSsf     "+files);
		/*
		 * if (bindException.hasErrors()) { System.out.println("has errors");
		 * 
		 * model.addAttribute("file",bindException.getFieldError()); return "about"; }
		 */
		System.out.println("has not errors");
		/*
		 * for (CommonsMultipartFile file : files.getMultipartFile()) {
		 * 
		 * byte[] data=file.getBytes();
		 * 
		 * File path= new File
		 * ("C:\\Users\\Shubham Rai\\Desktop\\File"+File.separator+file.
		 * getOriginalFilename());
		 * 
		 * file.transferTo(path);
		 * 
		 * System.out.println(file.getOriginalFilename());
		 * model.addAttribute(file.getOriginalFilename(),file);
		 * 
		 * }
		 */
	/*
	 * 
	 * 
	 * FileOutputStream fileOutputStream=new FileOutputStream(path);
	 * 
	 * fileOutputStream.write(data);
	 */
	
		return "fileForm";
	}
	
	@ModelAttribute("user")
	public Form getForm() {
		Form form=new Form();
		
		form.setEmail("da");
		form.setPassword("dd");
		form.setCheck("checking");
		
		return form;
	}
	
	
	@RequestMapping(path ="index", method =RequestMethod.POST )
	public String  home( HttpServletRequest request,Model model) {
		System.out.println("coing into index controller");
		
		String name=request.getParameter("name");
		
		model.addAttribute("name", name);
		
		
		
		 return "index";
	}

	@RequestMapping("/about")
	public   ModelAndView about(HttpServletRequest request,Model model) {
		
		
		System.out.println("came into about conyroller");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("rollno", 2);
		List<String > list=new ArrayList<String>();
		list.add("shubham");
		list.add("nps");
		list.add("rahul");
		/*
		 * String name=(String) model.asMap().get("typess"); System.out.println(name);
		 * model.addAttribute("name", name);
		 */
		System.out.println("REquwatr mapping  "+model.getAttribute("typess"));
		
		modelAndView.addObject("names", list);
		modelAndView.setViewName("about");
		
		
	
		
		return  modelAndView;
				
		
	}
	
	
	  @RequestMapping(value="/{day}", method = RequestMethod.GET)
	  public String  getForDay(@PathVariable("day") String day) { 
		
	System.out.println("came illegal ");
	 return "form";
	  
	  }
	 
	
		/*
		 * @ExceptionHandler private String ExceptionHandler() { // TODO Auto-generated
		 * method stub System.out.println("came intp Exdltpion handler"); return
		 * "index"; }
		 */
	
	@RequestMapping("form")
	public String form()
	{
		return 
				"form";
	}
}
