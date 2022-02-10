package com;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

public class Mythread  {
	
	String name;

	Mythread(String name){
		
		name=name;
	}
	
	
	public void name(int a,int b) {
		System.out.println("name1");
		
	}
	
	public void name3() {
		System.out.println("name1");
		
	}
	public  static void yes( ) {
		System.out.println("yes");
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mythread other = (Mythread) obj;
		return Objects.equals(name, other.name);
	}
	
	
		}


