package com.springDao;

import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.springEntity.Contact;
import com.springEntity.Student;

public class StudentDao {

	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

	private HibernateTemplate  htemplate;
	
	@Transactional
	public int insert(Student student)
	{
	
		htemplate.update(student);
		
	
		return 1;
	}
	@Transactional
	public void delete(Student student) {
		
		try {
		this.htemplate.delete(student);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}
	
@Transactional
	public void getSingleDetail(Student student) {
			
	Student  student2=htemplate.get(Student.class,2);
	student2.setStudentCity("ds");
	System.out.println(student2.getStudentCity());

		
	}

@Transactional
public  void  insertAll(Student student ,List<Contact>contacts) {
	
	try {
		this.htemplate.save(student);
	
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
}

	public HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}
		
	
	
	
}
