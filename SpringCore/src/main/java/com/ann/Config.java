package com.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.auto.Emp;

@Configuration
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean(name = {"person","temp"})
	public   Person getPerson() {
		return  new Person( );
		
	}
	@Bean(name = {"emp"})
	public EMPL name() {
		return new EMPL();
		
	}

}
