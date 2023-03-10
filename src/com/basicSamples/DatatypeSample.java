package com.basicSamples;

import java.text.NumberFormat;
import java.util.Locale;


public class DatatypeSample {

	public static void main(String[] args) {
//		Datatype sample
		
		int a=1;
		System.out.println(a);
		double myDouble=3.4;
		float myFloat=3.4f;
		
//		3.445 * e2
		double myDoubleScientific=3.445e2;
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myDoubleScientific);
		char letter='a';
		System.out.println(letter);
		String str1="Java Programming";
		String str2="Programming";
		System.out.println(str1);
		System.out.println(str2);
		int irange=-4250000;
		System.out.println(irange);
		long lrange=-42332200000L;
		System.out.println(lrange);
		
		Double number=new Double(9876543.210);
		NumberFormat numberFormatter;
		numberFormatter=NumberFormat.getNumberInstance();
		System.out.println(numberFormatter.format(number));
		
		Double currency=new Double(9876543.21);
		NumberFormat currencyFormatter;
		String currencyOut;
		currencyFormatter=NumberFormat.getCurrencyInstance(Locale.ITALY);
		currencyOut=currencyFormatter.format(currency);
		System.out.println(currencyOut);
		
		Double percent=new Double(0.75);
		NumberFormat percentFormatter;
		String percentOut;
		percentFormatter=NumberFormat.getPercentInstance(Locale.ITALY);
		percentOut=percentFormatter.format(percent);
		System.out.println(percentOut);

	}

}
