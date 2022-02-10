package com.proj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(javaDbconfig.class);
       
		/*
		 * Student student1=(Student) context.getBean("student1");
		 * System.out.println(student1.getC()); System.out.println(student1.getA());
		 * 
		 * System.out.println(student1.getAddress());
		 */
       Dao_Impl dao_Impl=context.getBean("Dao_Impl",Dao_Impl.class);
       Student student=dao_Impl.getStudent();
       System.out.println(student.getC());
       
       
       
		        
    }
    
    
    
}
