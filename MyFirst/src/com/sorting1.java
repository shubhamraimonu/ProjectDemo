package com;

public class sorting1 {

	public static void main(String[] args) {
		String[] arr={"1", "13", "5", "4", "10", "11", "12", "2", "9"};
		int[] intarr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			intarr[i]=Integer.parseInt(arr[i]);
		}
		
		System.out.println(intarr);
		/// for converting into int arr
		/*
		 * for(int i=0;i<intarr.length;i++) { // System.out.println(intarr[i]); }
		 */
		
		
		//sorting the array
		int temp=0;
		
		for(int i=0;i<intarr.length;i++)
		{
			
			for(int j=i+1;j<intarr.length;j++)
			{
				if(intarr[i]>intarr[j]){
					
					temp=intarr[i];
					intarr[i]=intarr[j];
					intarr[j]=temp;	
				}
				
			}
		}
		
		for(int i=0;i<intarr.length;i++) {
			System.out.println(intarr[i]);
		}
		
		for(int i=0;i<intarr.length;i++) {
			arr[i]=""+intarr[i];
		}
		
	
		
		
	}

}
