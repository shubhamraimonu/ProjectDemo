package com.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class MyException {

	public MyException() {
		// TODO Auto-generated constructor stub
	}

	@ExceptionHandler(value = Exception.class)
	private String ExceptionHandler(Exception exception) {
		// TODO Auto-generated method stub
		System.out.println("Thaks for coming");
		System.out.println("dfdfrgfrfgrgrfgfj    "+exception);
  System.out.println("came intp Exdltpion handler");
		return "index";
	}
	
}
