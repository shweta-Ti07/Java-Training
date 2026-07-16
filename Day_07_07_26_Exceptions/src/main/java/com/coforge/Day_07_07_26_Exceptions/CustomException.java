package com.coforge.Day_07_07_26_Exceptions;

public class CustomException {
	public static void main(String[] args) throws AgeNotSufficentException {
		
		
		Person p=new Person("swapna",44,"Hyderabad");
		if(p.getAge()<18)
			throw new AgeNotSufficentException("Person Age is less thand 18");
		else
			System.out.println("Person is eligile to cast Vote");
			
	}

}
