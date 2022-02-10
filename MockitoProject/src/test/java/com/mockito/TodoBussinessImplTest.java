package com.mockito;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


 

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TodoBussinessImplTest {

	
	  @Mock ToDoservice toDoservice;
	 

	
    @Test
	public void testRetriveTodoTospringCount() {
    	//ToDoservice toDoservice=mock(ToDoservice.class);
    	
        List<String> list= Arrays.asList("Learn s spring", "spring in tree", "what a point");
		when(toDoservice.retriveTodos("dummy"))
				.thenReturn(list);
		// TodoserviceStub todoserviceStub=new TodoserviceStub();
		//TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(toDoservice);
		List<String> filteredTodoList = toDoservice.retriveTodos("dummy");
		assertEquals(3, filteredTodoList.size());
	
		//verify(toDoservice).retriveTodos("dummy");
	}

    
	
	  @Test 
	  public void testRetriveTodoTospringCount1() { 
	  when(toDoservice.retriveTodos("dummy")).thenReturn(Arrays.asList("Learn s  spring","spring in tree","what a point")); 
	 
	  TodoBussinessImpl todoBussinessImpl =
	  new TodoBussinessImpl(toDoservice);
	  List<String> filteredTodoList =toDoservice.retriveTodos("dummy"); 
	  System.out.println(filteredTodoList.size());

  //assertEquals("Learn s spring", filteredTodoList.get(0));
	  //verify(toDoservice).retriveTodos("dummy"); 
	  }
	 
	/*
	 * @Test public void testRetriveTodoTospring() { ExpectedException
	 * exception=ExpectedException.none(); List listMock=mock(List.class);
	 * 
	 * when(listMock.get(anyInt())).thenReturn(2);
	 * 
	 * System.out.println(listMock.get(2)); System.out.println(listMock.get(3));
	 * 
	 * 
	 * 
	 * TodoserviceStub todoserviceStub=new TodoserviceStub(); TodoBussinessImpl
	 * todoBussinessImpl=new TodoBussinessImpl(todoserviceStub);
	 * List<String>filteredTodoList=todoBussinessImpl.retriveTodoSRelatedToSpring(
	 * "dumiies"); assertEquals(2, filteredTodoList.size());
	 * 
	 * 
	 * }
	 */


}
