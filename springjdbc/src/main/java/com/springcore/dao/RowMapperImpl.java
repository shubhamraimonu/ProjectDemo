package com.springcore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.Entity.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public RowMapperImpl() {
		// TODO Auto-generated constructor stub
	}

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
	Student student=new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
		
		
		return student;
	}

}
