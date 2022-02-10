package com.service;



import org.springframework.beans.factory.annotation.Autowired;

import com.Entity.Form;
import com.dao.UserDao;

@org.springframework.stereotype.Service
public class Service 
{

	@Autowired
private	UserDao userDao;
	public Service() {
		// TODO Auto-generated constructor stub
	}
	
	public  int  saveUser(Form form) {
		System.out.println("came into service class");
		int id=userDao.SaveUser(form);
		return id;
	}

}
