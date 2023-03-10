package com.basicSamples;

public class UnaryTernarySample {

	public static void main(String[] args) {

//		Unary operator
		int a=12,b=12;
		int result1,result2;
		System.out.println("Value of a: "+a);
		
//		Increment operator
		result1=++a;
		System.out.println("After increment: "+result1);
		System.out.println("value of b: "+b);
		
//		Decrement opertor
		result2=--b;
		System.out.println("After decrement: "+result2);
		
//		Ternay operator
		int februaryDays=29;
		String result;
		result=(februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result);

	}

}
