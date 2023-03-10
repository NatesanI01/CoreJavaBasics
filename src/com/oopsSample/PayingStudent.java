package com.oopsSample;

public class PayingStudent extends Student implements PrintStudent{
	
	boolean madePayment;
	public PayingStudent(String name,float gpa) {
		super();
		this.name=name;
		this.gpa=gpa;
		
	}
	
	public void gotoClass() {
		System.out.println("PayingStudent goto Next class... "+this.name);
	}
	
	public String toString() {
		String strObj="PayingStudent name is "+this.name;
		return strObj;
		
	}
	public void printMarksheet() {
		int mark1=95;
		int mark2=80;
		int mark3=70;
		int mark4=90;
		int mark5=85;
		double avg;
		avg=(mark1+mark2+mark3+mark4+mark5)/totalSubjects;
		System.out.println("Average of PayingStudent: "+avg);
	}

}
