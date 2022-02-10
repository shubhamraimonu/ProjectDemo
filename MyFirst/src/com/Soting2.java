package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Soting2 {

	

	public static void main(String[] args) {
		
		
		
		String[] arr={"1", "13", "5", "4", "10", "11", "12", "2", "9"};
		ArrayList<String> arrayList=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			arrayList.add(arr[i]);
		}
		
		
		
		
		Collections.sort(arrayList, new Comparator<String>() {
			public int compare(String s1,String s2)
			{
				return Integer.valueOf(s1)-Integer.valueOf(s2);
						
			}
			
		});
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
	
	
	
}
