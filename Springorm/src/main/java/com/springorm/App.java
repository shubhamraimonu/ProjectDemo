package com.springorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springDao.StudentDao;
import com.springEntity.Contact;
import com.springEntity.Student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
    	
    	
    	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    	
    	String line=bufferedReader.readLine();
    	System.out.println(line);
    	
    	Student student=new Student(9, "tupac", "heatE");
    	Student student2=new Student(3,"eminem","florida");
    	Contact contact=new Contact(8);
    	Contact contact1=new Contact(5);
    	Contact contact2=new Contact(6);
    	List<Contact> contacts=new ArrayList<Contact>();
    	contacts.add(contact);

    	student.setContacts(contacts);
    	
    	contact.student=student;
    	contact1.student=student;
    	contact2.student=student;
    	
    	
		/* studentDao.insertAll(student, contacts); */
    	
		 studentDao.insert(student); 
    	
		/* studentDao.getSingleDetail(student); */
		/* studentDao.delete(student); */

    
        System.out.println( "Hello World!" );
    }
}
