package com.ann;

import java.text.ParseException;

import javax.swing.text.html.HTMLEditorKit.Parser;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;


public class EMPL {

	public EMPL() {
		// TODO Auto-generated constructor stub
		System.out.println("Empl cdesfault constructor");
	}
	@Value("shubhamraiint th high")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting the enl ame");
		this.name = name;
	}
	
	

}
