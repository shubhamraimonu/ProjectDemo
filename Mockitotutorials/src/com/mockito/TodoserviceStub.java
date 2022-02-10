package com.mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoserviceStub implements ToDoservice {

	@Override
	public List<String> retriveTodos(String user) {
		// TODO Auto-generated method stub
		
		
		return Arrays.asList("Learn as sp2+ring","Learn spring","Learn to dance");
	}
	
}
