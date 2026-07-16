package com.coforge.Day_07_07_26_Exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {

	public static void main(String[] args) {
		
		Integer arr[]= {23,12,56,33,45,65,87,90,66};
		List<Integer> list=Arrays.asList(arr);
		
		Predicate<Integer> predicate=(n)->n%2==0;
		//int n=44;
		for(Integer n:list)
		if(predicate.test(n))
			System.out.println(n);
		System.out.println("-----------------");
		predicate=(n)->n>30;
		for(Integer n:list)
			if(predicate.test(n))
				System.out.println(n);
		//List of strings or names and print only those names starts with s
		
		
		String[] names= {"swapna","preethi","ram","srija","nayan","swetha"};
		List<String> namesList=Arrays.asList(names);
		Predicate<String> predicate1=(n)->n.charAt(0)=='s';
		for(String name:namesList)
		 if(predicate1.test(name))
			 System.out.println(name);
		//filter on streams will take predicate as a parameter
		
		
		
		
		
	}

}
