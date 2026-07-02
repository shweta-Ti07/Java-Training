package com.coforge;

public abstract class Shape {
	
	private  String type;
	public abstract void area() ;
	
	public abstract void perimeter() ;
	
	//abstract classes usage is re-usability
	//abstract class will not have instance
	//a method without definition need to be abstract method
	//a method with definition then it is concrete method
	//abstract method implementation must be given in child class by overriding

}
