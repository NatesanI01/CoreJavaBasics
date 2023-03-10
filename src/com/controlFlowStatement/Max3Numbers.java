package com.controlFlowStatement;

import java.util.Scanner;

public class Max3Numbers {

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the three number: ");
		int number1=input.nextInt();
		int number2=input.nextInt();
		int number3=input.nextInt();
		if((number1>number2) && (number1>number3)){
			System.out.println(number1+" is the greatest number");
		}
		else if(number2>number3)
		{
			System.out.println(number2+" is the greatest number");
		}
		else
			System.out.println(number3+" is the greatest number");
		input.close();
		

	}

}
