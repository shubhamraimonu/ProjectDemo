package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	
	public static void main(String[] args) {
	
		
		AbstractApplicationContext applicationContext= new ClassPathXmlApplicationContext("config.out.xml");
		 applicationContext.registerShutdownHook(); 
		cClass class1=(cClass)applicationContext.getBean("class1");
		System.out.println(class1.a);
		System.out.println(class1.getName());
	
		
		
	}

}

