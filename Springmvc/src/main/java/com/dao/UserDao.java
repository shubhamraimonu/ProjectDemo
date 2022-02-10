package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.Form;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public UserDao() {
		// TODO Auto-generated constructor stub
	}

	

	@Transactional
	public  int SaveUser(Form form ) {
		
  		 hibernateTemplate.update(form);
  		return 3;
	}
	
}
