package com.springcore.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.config.javaDbconfig;
import com.spring.Entity.Student;
import com.springcore.dao.DaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     
        ApplicationContext context=new AnnotationConfigApplicationContext(javaDbconfig.class);
        DaoImpl daoImpl=context.getBean("dao",DaoImpl.class);
      
        
       
        
        List<Student> student=daoImpl.getStudent(1);
        System.out.println(student);
        
    }
}
