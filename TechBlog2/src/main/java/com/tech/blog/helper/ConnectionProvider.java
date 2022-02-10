
package com.tech.blog.helper;
import  java.sql.*;
public class ConnectionProvider {
	
private static Connection con=null;
public static Connection getConnection() {
		try {
		//create a conncetion
		if (con==null) {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","pass@123");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return con;
	}

}
