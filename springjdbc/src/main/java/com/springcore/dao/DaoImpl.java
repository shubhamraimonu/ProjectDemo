package com.springcore.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.Entity.Student;

@Component("dao")
public class DaoImpl  implements DaoInteface {

	@Autowired
	@Qualifier("template")
	private JdbcTemplate template;
	
	public DaoImpl() {
		// TODO Auto-generated constructor stub
	}


	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}



	public List<Student> getStudent(int studentId) {
		// TODO Auto-generated method stub
		
        String query=" select * from student ";
        
        RowMapperImpl rowmapper=new RowMapperImpl();
       
        List<Student> list=template.query(query,rowmapper );
        
		return  list;
		
	}


	public int insert(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
