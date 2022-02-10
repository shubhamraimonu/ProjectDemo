package com.mockito;

import java.util.ArrayList;
import java.util.List;

public class TodoBussinessImpl {

	private ToDoservice toDoservice;
	
	public List<String> retriveTodoSRelatedToSpring(String user) {
		
		List<String>filteredtodoStrings=new ArrayList<String>();
		List<String>allTodo=toDoservice.retriveTodos(user);
		
		for(String todoString : allTodo)
		{
			if(todoString.contains("spring"))
			{
				filteredtodoStrings.add(todoString);
			}
		}
		
		return filteredtodoStrings;
	};
	
	
}
