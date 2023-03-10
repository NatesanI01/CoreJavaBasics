package com.basicSamples;

public class Calculator {
//	Instance variable
	int number;
//	Static variable
	static int c;
	final double pi=3.14;
//	a and b are parameters
	public void add(int a,int b) {
//		sum is local variable
		System.out.println("value of a..."+ a++);
		System.out.println("value of a..."+ a);
		System.out.println("value of b..."+ ++b);
		
		int sum;
		sum=a+b;
		System.out.println(sum);
	}
	public void area (double radius) {
		double area=pi*radius*radius;
		System.out.println("The Area: "+area);
		
	}

	public static void main(String[] args) {
		Calculator calObj=new Calculator();
		calObj.add(5,10);
		calObj.number=10;
		c=15;

	}

}
