package com.proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	@Value("1")
	int a;
	@Value("2")
	int b;
	@Value("Shubham")
	String c;
	
	/*
	 * @Autowired Address address;
	 */
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}

	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	/*
	 * public Student(int a, int b, String c, Address address) { super();
	 * System.out.println("Parametrized constructot"); this.a = a; this.b = b;
	 * this.c = c; this.address = address; }
	 */
	
	
	
	  public Student() { System.out.println("coming in the default constructor"); }
	  
	public Student(int a, int b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	 
	
	
	
	

}
