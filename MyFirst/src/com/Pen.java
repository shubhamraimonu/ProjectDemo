package com;



public  class Pen  extends Mythread {
	
	Pen(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void name(long a,long b) {
		// TODO Auto-generated method stub
		System.out.println("name 2");
		
	}
	
	
	public void name4() {
		// TODO Auto-generated method stub
		System.out.println("name 55");
		
	}
	
	
	public static void yes() {
		System.out.println("yes2");
		
	}
	
	
	public int  setProp(int a)
	{
	CollectionUtils collectionUtils=new CollectionUtils();

	return collectionUtils.prop(a)*3;
		
	}
   

}
