package com.coforge;

//concept--Inheritance
public class Main {
	
	public static void main(String[] args) {
		
//		EmployeeClass ec1=new EmployeeClass("swapna", 44, "Hyderabad", 123, 50000);
//		System.out.println(ec1);
//		
//		Student s1=new Student("Lokesh", 20, "Pune", 345, "CSE", "GEU");
//		System.out.println(s1);
//		
//		//System.out.println(ec1.sayHello());
//		System.out.println(s1.sayHello("9090909090"));
		
		
		Person p=new Person();
		System.out.println(p);
		System.out.println(p.sayHello("1234567890"));
		p=new Student();//runtime
		System.out.println(p);
		System.out.println(p.sayHello("909090909090"));//dynamic binding
		p=new EmployeeClass();
		System.out.println(p);
		
		
		
		
		
		
		
	}

}
