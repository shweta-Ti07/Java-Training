package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Stack;

public class StackMain {
	
	public static void main(String[] args) {
		//stack follows Last in first out -- LIFO
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=1;i<=10;i++)
			//stack.push((int)(Math.round( Math.random()*100)));
			stack.push(i*3);
		System.out.println(stack);
		
		
		//System.out.println(stack.pop());
		System.out.println(stack.search(42));//will not return index, will return a number from top most element starting top most is at 1
		//complete all operations on stack
		
	}

}
