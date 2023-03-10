package com.classesAndObjects;

import java.util.Arrays;

public class Exercise {

	public static void main(String[] args) {
//		first 
		String hi="Hi, ";
		String mom="mom.";
		System.out.println(hi+mom);
		System.out.println(hi.concat(mom));
		
//		second
		String fullName="Natesan I karthi";
		System.out.print(fullName.toUpperCase().charAt(0));
		for(int i=1;i<fullName.length()-1;i++)
		{
			if(fullName.charAt(i)==' ')
				System.out.print(" "+ fullName.toUpperCase().charAt(i+1));
		}
		
//		third
		String str1="parliament";
		String str2="partial men,";
		boolean status=true;
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s","").replace(",", "").replace(".", "");
		if(str1.length()!=str2.length())
			status=false;
		else{
			char []a=str1.toCharArray();
			char []b=str2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);	
		    status=Arrays.equals(a, b);
		}
		if(status)
			System.out.println("anagram");
		else
			System.out.println("Not");
			
	}

}
