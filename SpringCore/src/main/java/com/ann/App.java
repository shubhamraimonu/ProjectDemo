package com.ann;

import javax.management.BadAttributeValueExpException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App 

{
    public static void main( String[] args )
    {
    	  
    	

    	
		  ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		  Person person=context.getBean("person",Person.class);
	  
		  System.out.println(person.getEmpl().getName());
		  System.out.println(person);
		  
		  System.out.println(context.isSingleton("person"));
		  
    }
}
