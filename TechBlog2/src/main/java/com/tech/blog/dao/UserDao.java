package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


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
	
	public User getByEmailandPassword(String email,String password) {
	
	User user=null;
	System.out.println(email + "   "+ password);
	
	try {
		Connection connection=this.con;
		String query=" select * from user u where u.email=? and u.password=? ";
		System.out.println(query);
		PreparedStatement psmt=connection.prepareStatement(query);
		psmt.setString(1, email);
		psmt.setString(2, password);
		ResultSet resultset= psmt.executeQuery();
		
		if (resultset.next()) {
			user=new User();
			System.out.println("came into user details");
			System.out.println(resultset.getInt("id"));
			user.setId(resultset.getInt("id"));
			user.setAbout(resultset.getString("about"));
			user.setDateTime(resultset.getTimestamp("rdate"));
			user.setEmail(resultset.getString("email"));
			user.setGender(resultset.getString("gender"));
			user.setName(resultset.getString("name"));
			user.setProfile(resultset.getString("profile"));
			user.setPassword(resultset.getString("password"));
			System.out.println(user.toString());
			System.out.println("take it");
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
		System.out.println("come to end");
		return user;
	}
	
	public boolean UpdateUserDetails(User user) {
		
		 boolean flag=false;
		try {
			Connection connection=this.con;
			String query="  update user u set  u.name=?, u.email=?, u.gender=?,u.about=?,u.profile=? where u.id=?  ";
			System.out.println(query);
			PreparedStatement psmt=connection.prepareStatement(query);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getEmail());
			psmt.setString(3, user.getGender());
			psmt.setString(4, user.getAbout());
			psmt.setString(5, user.getProfile());
			psmt.setInt(6, user.getId());
			
			psmt.executeUpdate();
			
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return flag;
		
	}
	
}
