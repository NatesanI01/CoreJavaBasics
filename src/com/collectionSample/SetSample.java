package com.collectionSample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class SetSample {

	public static void main(String[] args) {
		HashSet<Integer> evenNumber=new HashSet<>();
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		evenNumber.add(6);
		evenNumber.add(8);
		System.out.println("Hashset: "+evenNumber);
		
		Iterator<Integer> iterate=evenNumber.iterator();
		System.out.println("Hashset using iterator: ");
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		
		TreeSet <String> empList=new TreeSet<>();
		empList.add("John");
		empList.add("Peter");
		empList.add("Andrew");
		System.out.println("List of employee... "+empList);
		
		HashSet<String> empList1=new HashSet<>();
		empList1.add("Sanjay");
		empList1.add("Esakki");
		empList1.add("Natesan");
		empList1.add("Sreeram");
		System.out.println(empList1);
		
		

	}

}
