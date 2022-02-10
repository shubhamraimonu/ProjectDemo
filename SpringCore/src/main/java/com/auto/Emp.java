package com.auto;

import java.util.jar.Attributes.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	Address address;
	String name;

	public Address getAddress(Address address) {
		System.out.println("getter address");
		System.out.println(address);
		return address;
	}

	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		System.out.println("Setting th address");
		this.address = address;
	}

	/*
	 * public Emp() { // TODO Auto-generated constructor stub
	 * System.out.println("came to the default construcotr"); }
	 * 
	 * 
	 * 
	 * @Qualifier("address2") public Emp(Address address) { super();
	 * System.out.println(" address cnstructor"); System.out.println(address);
	 * this.address = address; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting the name");

		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", name=" + name + "]";
	}

}
