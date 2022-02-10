package com.tech.blog.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.Driver;
import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Messages;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
      
		

	    
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		System.out.println(email+"     "+password);
		System.out.println("not comign");

	
	
		ServletContext  config =getServletContext();
		
		
		Filter
		
		
		
		
		
		
		
		 UserDao userDao=new UserDao(ConnectionProvider.getConnection());
		User user=userDao.getByEmailandPassword(email,  password);
		
		if (user==null) {
			
		
			Messages message=new Messages("Invalid details ! try with another ", "error", "alert-danger");
			
			HttpSession session=request.getSession();
			session.setAttribute("msg",message );
			
				
			response.sendRedirect("login.jsp");
			System.out.println("come into invalid box");
		
			
			
		}
		else {
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", user);
			
			response.sendRedirect("profile.jsp");
				/* response.sendRedirect("profile.jsp"); */
			 
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
