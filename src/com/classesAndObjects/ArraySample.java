package com.classesAndObjects;

public class ArraySample {

	public static void main(String[] args) {
		
		int [] age= {12,4,5,2,5};
		
		System.out.println("Accessind Element of Array");
		System.out.println("First Element: "+age[0]);
		System.out.println("Second Element: "+age[1]);
		System.out.println("Third Element: "+age[2]);
		System.out.println("Fourth Element: "+age[3]);
		System.out.println("Fifth Element: "+age[4]);
		
		System.out.println("Usinf for loop");
		for (int i=0;i<age.length;i++)
			System.out.println(age[i]);
		
		System.out.println("Using for each loop");
		for (int a:age)
			System.out.println(a);
		
		int [] numbers= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		for(int number:numbers)
			sum +=number;
		int arrayLength=numbers.length;
		
		average=((double)sum/(double)arrayLength);
		
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+average);
		
//		create 2D array
		int[][]a={
			{1,2,3},
			{4,5,6,9},
			{7}};
		
		System.out.println("Length of row 1: "+a[0].length);
		System.out.println("Length of row 2: "+a[1].length);
		System.out.println("Length of row 3: "+a[2].length);
	}

}
