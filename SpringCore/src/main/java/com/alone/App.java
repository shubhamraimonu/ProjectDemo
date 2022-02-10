package com.alone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 


{
    public static void main( String[] args )
    {
		
		  ApplicationContext context=new ClassPathXmlApplicationContext("com/alone/config.xml");
		 Person person=context.getBean("person",Person.class);
		 System.out.println(person.getFriend());
		 System.out.println(person.getMap());
		 System.out.println(person.properties);
     
       
    }
}
