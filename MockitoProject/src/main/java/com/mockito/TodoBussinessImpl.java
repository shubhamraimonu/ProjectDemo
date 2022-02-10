package com.mockito;

import java.util.ArrayList;
import java.util.List;

public class TodoBussinessImpl {

	private ToDoservice toDoservice;
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * List list=new ArrayList(); list.add("sd"); System.out.println(list.get(1)); }
	 */
	
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
	}

	public TodoBussinessImpl(ToDoservice toDoservice) {
		super();
		this.toDoservice = toDoservice;
	};
	
	
}
