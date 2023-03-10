package com.basicSamples;

import java.util.Scanner;

public class ConsoleInSamples {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an interger: ");
		int number=input.nextInt();
		System.out.println("You entered= "+number);
		
		System.out.println("Enter the float: ");
		float myFloat=input.nextFloat();
		System.out.println("Float entered= "+myFloat);
		
		System.out.println("Enter double: ");
		double myDouble=input.nextDouble();
		System.out.println("Double entered= "+myDouble);
		
		System.out.println("Enter the text: ");
		String myString=input.nextLine();
		System.out.println("Text entered= "+myString);
		
		input.close();

	}

}
