package com.tech.blog.servlets;

import java.io.IOException;import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;


@MultipartConfig
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		String about=request.getParameter("about");
		String  gender=request.getParameter("gender");
		
	Part part=request.getPart("image");
	String  imgName=part.getSubmittedFileName();
	
	
	System.out.println(name+"  "+email+"  "+ about+"   "+gender + "   "+imgName);
	
	HttpSession session=request.getSession();
	
	User user=(User) session.getAttribute("currentUser");
		
		user.setAbout(about);
		user.setEmail(email);
		user.setGender(gender);
		user.setProfile(imgName);
		user.setName(name);
		
		System.out.println(user);
		UserDao userDao=new UserDao(ConnectionProvider.getConnection());
		boolean flag=userDao.UpdateUserDetails(user);
		if(flag) {
			System.out.println("Updated in DB");
			response.getWriter().print("Updated in DB");
		}
		else {
			
		
		response.getWriter().print(" not Updated in DB");
		System.out.println(" not Updated in DB");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
