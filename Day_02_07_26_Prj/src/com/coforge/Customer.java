package com.coforge;
//area--->Hyderabad
public class Customer {
	
	String name;//object variable
	String contactNum;
	static String loc="Chennai";//shared property,class variable
	public Customer() {
		super();
	}
	public Customer(String name, String contactNum) {
		super();
		this.name = name;
		this.contactNum = contactNum;
	
	}
	
	public static void displayLoc() {//class method
		//non static methods are object methods
		
		//static methods works on only static members
		System.out.println(loc);
	}
	
	
	

}
