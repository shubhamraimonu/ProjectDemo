package com.tcs;



public  class Pen   {
	

	
	
	public Pen(CollectionUtils collectionUtils) {
		super();
		this.collectionUtils = collectionUtils;
	}


	CollectionUtils collectionUtils;//=new CollectionUtils();
	
	public void name4() {
		// TODO Auto-generated method stub
		System.out.println("name 55");
		
	}
	
	
	public static void yes() {
		System.out.println("yes2");
		
	}
	
	
	public int  setProp(int a)
	{
	

	return (collectionUtils.prop(a)*3);
		
	}
   

}
