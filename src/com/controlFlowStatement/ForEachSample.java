package com.controlFlowStatement;

public class ForEachSample {

	public static void main(String[] args) {
		int [] numbers= {5,9,7,6,-5,12};
		int sum=0;
		for(int number:numbers)
			sum+=number;
		System.out.println("Sum= "+sum);

	}

}
