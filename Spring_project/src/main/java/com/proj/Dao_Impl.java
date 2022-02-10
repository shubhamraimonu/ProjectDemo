package com.proj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.ReflectionUtils;

public class Dao_Impl {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public Student  getStudent() {
		
		String query="select * from student where a=1";
		RowMapper<Student> rowmapper=new RowMapper<Student>() {
			
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
		Student student=new Student();
		student.setA(rs.getInt("a"));
		student.setB(rs.getInt("b"));
		student.setC(rs.getString("c"));
				return student;
			}
		};
		Student student=jdbcTemplate.queryForObject(query,rowmapper);
		return student;
		
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Dao_Impl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public Dao_Impl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dao_Impl [jdbcTemplate=" + jdbcTemplate + "]";
	}
	
}
