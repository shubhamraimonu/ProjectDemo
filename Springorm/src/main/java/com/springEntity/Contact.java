package com.springEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

	public Contact() {
		// TODO Auto-generated constructor stub
	}
	@Id
	int mob_no;
	
	  @ManyToOne 
	  public  Student student;
	 

	public int getMob_no() {
		return mob_no;
	}

	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}

	public Contact(int mob_no) {
		super();
		this.mob_no = mob_no;
	}
	
	

}
