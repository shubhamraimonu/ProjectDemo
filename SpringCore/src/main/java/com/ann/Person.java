package com.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Person {
	
	
	  public Person() { // TODO Auto-generated constructor stub
	  System.out.println("default onstrutor");
	
	  }
	  
	  @Autowired
	  EMPL empl;
	  
	 
	public EMPL getEmpl() {
		return empl;
	}


	public void setEmpl(EMPL empl) {
		this.empl = empl;
	}

	@Value("#{T(java.lang.Math).sqrt(144)}")
	String name="yes";
@Value("#{'Shubham'+'tuti'}")
	String roll;
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		System.out.println("setting the name");
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public Person(String name, String roll) {
		super();
		System.out.println("constructor");
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", roll=" + roll + "]";
	}
	
	
	
}
