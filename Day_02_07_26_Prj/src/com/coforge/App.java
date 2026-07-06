package com.coforge;

//driver class
public class App {

	public static void main(String[] args) {
		
		Employee e1=new Employee();//default constructor
		System.out.println(e1.ename);
		System.out.println(e1.getEid());
		System.out.println(e1);//toString()
		
		Employee e2=new Employee("shweta", 123, 50000);
		System.out.println(e2);
		
		Employee e3=new Employee();
		e3.setEname("Amit");
		e3.setEid(234);
		e3.setSalary(70000);
		System.out.println(e3.getEname());
		System.out.println(e3.getEid());
		System.out.println(e3.getSalary());
	}

}
