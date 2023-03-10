package com.controlFlowStatement;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=-1,b=1,c;
		System.out.println("Enter the number: ");
		int number=input.nextInt();
		System.out.println("The Fibanocci series is:");
		for(int i=0;i<number;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		input.close();
	

	}

}
