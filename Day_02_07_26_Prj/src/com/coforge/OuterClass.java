package com.coforge;

public  class OuterClass {//outer classes can't be static
	
	 static String ocName;//properties
	
	public void printName() { //methods
		System.out.println(ocName);
	}
	
	static class InnerClass{//inner class can be static
	
		 String inName;
		
		public void printName() { 
			System.out.println(inName);
		}
		
	}
	


}
