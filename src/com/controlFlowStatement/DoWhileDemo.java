package com.controlFlowStatement;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=input.nextInt();
		do {
			sum+=number;
			System.out.println("Enter the number: ");
			number=input.nextInt();
		}while(number>=0);
		System.out.println("The sum of the number: "+sum);
		input.close();

	}

}
