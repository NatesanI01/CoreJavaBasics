package com.controlFlowStatement;

import java.util.Arrays;

public class LargestNumberArray {

	public static void main(String[] args) {
		int[] array= {10,25,1000,125,99,560,2,11};
		int temp = 0;
		Arrays.sort(array);;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(array[array.length-1]+ " is the greatest number in a array");

	}

}
