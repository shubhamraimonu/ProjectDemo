package com.exception;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class MyException {

	public MyException() {
		// TODO Auto-generated constructor stub
	}


	@ExceptionHandler(value = Exception.class)
	public String  centralizedException(Exception exception,Model model ) {
		/* System.out.println("Exception "+exception); */
		System.out.println("EXCEPTION  "+ exception);
		model.addAttribute("exception", "Binding Exception" );
		return "error";
		
	}
	
}
