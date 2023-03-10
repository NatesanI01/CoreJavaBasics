package com.classesAndObjects;

public class StringSample {

	public static void main(String[] args) {
		
		String strOne="Java";
		strOne=strOne+" Programming";
		System.out.println("Value of strOne: "+strOne);
		System.out.println("Value of strOne: "+strOne.hashCode());

//		Getting stores in new reference, So print strOne will be same
//		strOne.concat(" Language");
		
//		But if we assign it to string will have new reference
		strOne=strOne.concat(" Language");
		System.out.println("Value of strOne after concat: "+strOne);
		System.out.println("Value of strOne: "+strOne.hashCode());
		
		String strTwo=new String("Functional Programming ");
		strTwo.concat("Language");
		
		System.out.println(strTwo.length());
		System.out.println(strTwo.substring(10).trim().toUpperCase());
		System.out.println("Value of strOne: "+strTwo);
		
		
//		Create string
		String first="Java is a Object Oriented Programming";
		String second="Python";
		String third="Language";
		
//		Print
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

		
//		Length of the string
		System.out.println("Length of the string... "+first.length());
		
//		concat two strings
		String joinedString=first.concat(third);
		System.out.println("Joined String is... "+joinedString);
		
//		Comapre two strings
		first="java programming";
		second="java programming";
		third="python programming";

		
		first.charAt(2);
		first.split(" ");
		
		boolean result1=first.equals(second);
		System.out.println("String first and second are equal: "+result1);
		boolean result2=first.equals(third);
		System.out.println("String first and third are equal: "+result2);
		
		String example="Hello";
		example=example.concat("Welcome");
		
//		String created using object
		String newString=new String("Java Program");
		String newStringOne=new String("C# program");
		System.out.println("Value of newString.."+newString.equals(newStringOne));
		
		


	}

}
