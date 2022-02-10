package com.auto;

import java.security.DomainCombiner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Emp address");
		
		ApplicationContext context=new  ClassPathXmlApplicationContext("config.xml");
		/*
		 * Address address=context.getBean("address",Address.class); address.getCity();
		 */
		Address address=context.getBean("address2",Address.class);
		System.out.println(address);
		Emp emp=context.getBean("emp",Emp.class);
		/* emp.getAddress(); */
		System.out.println(emp);
		
		
	}

}
