package com.proj;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.proj")
public class javaDbconfig  {

	public javaDbconfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean(name = {"ds"})
	public DataSource getSource() {
		
		DriverManagerDataSource dSource=new DriverManagerDataSource();
		dSource.setDriverClassName("com.mysql.jdbc.Driver");
		dSource.setUrl("jdbc:mysql://localhost:3306/shubham");
		dSource.setUsername("root");
		dSource.setPassword("pass@123");
		
		return dSource;
		
	}
	@Bean(name = {"template"})
	public  JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getSource());
		
		return template;
		
	}
	
	@Bean(name= {"Dao_Impl"})
	public  Dao_Impl getDao_Impl() {
		
		Dao_Impl dao_Impl=new Dao_Impl();
		dao_Impl.setJdbcTemplate(getJdbcTemplate());
		return dao_Impl;
		
	}
	

}
