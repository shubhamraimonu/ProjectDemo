package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;



import com.tech.blog.entities.User;

public class UserDao {
	
	private Connection con;
	
	public UserDao(Connection con) {
		// TODO Auto-generated constructor stub
		this.con=con;
	}

	
	public boolean saveUser(User user) {
		
		boolean flag = false;

		try {
		
			String query=" insert into user (name,email,password,gender,about)  values (?,?,?,?,?)";
			
			PreparedStatement psmt=this.con.prepareStatement(query);
			psmt.setString(1,user.getName());
			psmt.setString(2, user.getEmail());
			psmt.setString(3, user.getPassword());
			psmt.setString(4, user.getGender());
			psmt.setString(5, user.getAbout());
			
			
			int update=psmt.executeUpdate();
			System.out.println(update);
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return flag ;
		
		
	}
}
