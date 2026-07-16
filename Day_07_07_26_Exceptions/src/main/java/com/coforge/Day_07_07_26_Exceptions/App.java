package com.coforge.Day_07_07_26_Exceptions;

/**
 * Hello world!
 */
public class App {
	
	public static void div(int a,int b) { //propagation of exception
		
		if(b==0)
			throw new ArithmeticException();
		else
			System.out.println(a/b);
		
	}
	
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
        div(5,0);
        }catch (Exception e) {
			// TODO: handle exception
		}
        
        System.out.println("Program completed");
      
        
    }
}
