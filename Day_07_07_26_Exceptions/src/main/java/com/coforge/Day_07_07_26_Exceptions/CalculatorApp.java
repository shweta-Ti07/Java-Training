package com.coforge.Day_07_07_26_Exceptions;

public class CalculatorApp  {

	public static void main(String[] args) {
		
//		CalculatorInterface ci=()->{
//			int a=10,b=5;
//			System.out.println(a/b);
//		};
		
//		CalculatorInterface ci=(a,b)->a+b;//when only one return is there 
//		System.out.println(ci.add(5, 6));
		
		
//		CalculatorInterface ci=()->{
//			int a=6,b=3;
//			return a-b;
//		};
//		System.out.println(ci.sub());
		
		
		CalculatorInterface ci=(a,b)->{
			System.out.println(a*b);
		};
		ci.mul(8,9);
//		ci.div();
	}

//	@Override
//	public int add(int a, int b) {
//		
//		return a+b;
//	}

//	@Override
//	public int sub() {
//		int a=67,b=34;
//		return a-b;
//	}
//
//	@Override
//	public void mul(int a, int b) {
//	
//		System.out.println(a*b);
//	}
//
//	@Override
//	public void div() {
		
//		int a=10,b=5;
//		System.out.println(a/b);
//		
//	}

}
