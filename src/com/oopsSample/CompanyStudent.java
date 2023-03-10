package com.oopsSample;

public class CompanyStudent extends Student implements PrintStudent {
	String companyName;
	public CompanyStudent(String name,String companyName) {
		this.name=name;
		this.companyName=companyName;
	}
	public void gotoClass() {
		System.out.println("Goto class after evaluation... "+this.name);
	}
	
	public String toString() {
		String strObj="ComapnyStudent name is "+this.name;
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
		System.out.println("Average of CompanyStudent is: "+avg);
	}

}
