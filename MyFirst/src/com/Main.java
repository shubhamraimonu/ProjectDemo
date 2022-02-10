package com;

import java.util.*;


import java.io.*;
import java.nio.channels.NonWritableChannelException;

public class Main {

public static void main(String[] args) {

	
	
	
	List<Integer> list=   Arrays.asList(1,10,1,2,2,3,3);
	
	ArrayList<Integer>nList=new ArrayList<>();
	
	for(Integer elem   : list) {
		
		if(!nList.contains(elem))
		{
			nList.add(elem);
		}
		
		
	}
	
	for(int i=0;i<nList.size();i++)
	{
		System.out.println(nList.get(i));
	
	}
	
	
	
}

}