package com.coforge.Day_07_07_26_Exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionApp {

	public static void main(String[] args) {
		Function<Integer, Integer> function=(n)->n*5;
		System.out.println(function.apply(12));
		
		Integer arr[]= {23,12,56,33,45,65,87,90,66};
		List<Integer> list=Arrays.asList(arr);
		for(Integer n:list)
			System.out.println(function.apply(n));
		
		String[] names= {"swapna","preethi","ram","srija","nayan","swetha"};
		List<String> namesList=Arrays.asList(names);
		Function<String,String> function1=(n)->n.toUpperCase();
		for(String name:namesList)
			 System.out.println(function1.apply(name));
		
		
		//map on streams will take function as a parameter
			

	}

}
