package com.coforge;



public class DemoOnStatic {
	
	public static void main(String[] args) {
		
//		System.out.println("inside main");
//		
//		Customer c1=new Customer("mitra","2323232323");
//		Customer c2=new Customer("mahesh","9090909090");
//		Customer c3=new Customer("ankit","8989898989");
//		
//		System.out.println(c1.name+"  "+c1.contactNum+"  "+Customer.loc);
//		Customer.loc="hyd";
//		System.out.println(c2.name+"  "+c2.contactNum+"  "+Customer.loc);
//		System.out.println(c3.name+"  "+c3.contactNum+"  "+Customer.loc);
//		System.out.println(c1.name+"  "+c1.contactNum+"  "+Customer.loc);
//		c1.displayLoc();//non static methods are object methods
//		c2.displayLoc();
//		c3.displayLoc();
		
//		Customer.displayLoc();
		
		OuterClass oc=new OuterClass();
		OuterClass.ocName="outerclass1";
		oc.printName();
		OuterClass.InnerClass in= new OuterClass.InnerClass();
		in.inName="innerclass1";
		in.printName();
		
	}
	
	

}
