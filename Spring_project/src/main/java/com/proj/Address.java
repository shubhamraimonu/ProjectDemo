package com.proj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Azamgarh")
	String name;
	

	public Address(String name) {
		super();
		this.name= name;
	}


	
	  public Address() { super(); // TODO Auto-generated constructor stub }
	  }



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Address [name=" + name + "]";
	}
	
}
