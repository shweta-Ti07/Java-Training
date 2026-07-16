package com.coforge.Day_07_07_26_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface Hello{
	public void sayHello();
}

public class Main {
	
	
	public static void main(String[] args) {
		
		Hello h=()->{
			System.out.println("hello....");
		};
		h.sayHello();
		
		Integer arr[]= {1,2,3,4,5,6};
		ArrayList<Integer> list=(ArrayList<Integer>) Arrays.asList(arr);
		
		list.forEach(i->System.out.println(i));
		
		
		
	}

}
