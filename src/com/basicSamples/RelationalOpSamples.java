package com.basicSamples;

public class RelationalOpSamples {

	public static void main(String[] args) {
//		create variable
		int a=7, b=11;
		System.out.println("a is "+a+" and b is "+b);
		System.out.println(a == b); // equal to 
		System.out.println(a != b); //not equal to
		System.out.println(a > b); //greater than
		System.out.println(a < b); //less than
		System.out.println(a >= b); //greater than or equal to
		System.out.println(a <= b); //less than or equal to
		System.out.println((5 > 3) && (8 > 5)); // and operator
		System.out.println((5 < 3) && (8 < 5)); //and operator
		System.out.println((5 < 3) & (8 < 5));
		System.out.println((5 < 3) || (8 > 5)); // or operator
		System.out.println((5 > 3) || (8 < 5));
		System.out.println((5 > 3) | (8 < 5));
		System.out.println((5 < 3 ) || (8 < 5));
		System.out.println(!(5 == 3)); // inverse
		System.out.println(!(5 > 3)); // inverse
	}
}
