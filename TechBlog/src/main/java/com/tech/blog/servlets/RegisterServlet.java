package com.tech.blog.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet() {
        super();
        
     
        
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		   StringBuffer aString=new StringBuffer("dfdsf");
		   
		   aString.append("dfss");
		   
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(request.getInputStream()));
				
		
		
		
		
		
		
				String json = "";
				if(br != null){
					json = br.readLine();
					System.out.println(json);
				}
		
				
				/*
				 * ObjectMapper mapper = new ObjectMapper();
				 * 
				 * // 3. Convert received JSON to Article Article article =
				 * mapper.readValue(json, Article.class);
				 * 
				 * // 4. Set response type to JSON response.setContentType("application/json");
				 * 
				 * // 5. Add article to List<Article> articles.add(article);
				 * 
				 * // 6. Send List<Article> as JSON to client
				 * mapper.writeValue(response.getOutputStream(), articles);
				 */
				
		String name=request.getParameter("user_name");
		System.out.println(name);
		String email=request.getParameter("user_email");
		System.out.println(email);
		String password=request.getParameter("user_password");
		System.out.println("password "+password);
		String gender=request.getParameter("gender");
		String about=request.getParameter("about");
		String check=request.getParameter("check");
		
		
		if (check!=null) {
			
			System.out.println("check is on");
			User user=new User(name, email, password, gender, null, about);
			
			
			UserDao userDao=new UserDao(ConnectionProvider.getConnection());
			boolean flag=userDao.saveUser(user);
			if (flag) {
				response.getWriter().print("Data Inserted");
			}
			
		}
		else {
			response.getWriter().print("Please tick the agreement box");
			
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Came into Post method");
		doGet(request, response);
	}

}
