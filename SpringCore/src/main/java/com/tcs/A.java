package com.tcs;

public class A {

	String name;
	
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("Came to the  constructor A");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	
	
	

}
