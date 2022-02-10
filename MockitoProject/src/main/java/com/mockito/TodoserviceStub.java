package com.mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoserviceStub implements ToDoservice {

	public List<String> retriveTodos(String user){
		
	 return	Arrays.asList("Learn s spring","spring in tree","what a point");
		
	}
	
}
