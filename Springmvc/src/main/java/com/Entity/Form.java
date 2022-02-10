package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Tables;

@Entity
@Table(name = "Forming")
public class Form {

	public Form() {
		// TODO Auto-generated constructor stub
	}
	
@Id
	int id;
@Column(name = "abc")
	String email;
	@Column(name = "erf")
	String password;
	@Column(name = "trying")
	String check;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "Form [emails=" + email +"  id   "+id+ ", password=" + password + ", check=" + check + "]";
	}

	public Form(String emails, String password, String check) {
		super();
		this.email = emails;
		this.password = password;
		this.check = check;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
