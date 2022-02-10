package com.tcs;

import java.util.ArrayList;
import java.util.spi.AbstractResourceBundleProvider;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class cClass {

	
	String name;
	A a;
	ArrayList<String> list;
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public cClass(String name, ArrayList<String> list) {
		super();
		this.name = name;
		this.list = list;
	}
	public cClass() {
		super();
		System.out.println("it will run like that only");
		// TODO Auto-generated constructor stub
	
	}
	public cClass(String name, A a) {
		super();
		this.name = name;
		this.a = a;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init fucntion is performing well in the fucntion");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("distroy function is invoked   ");
	}
	
	
}
