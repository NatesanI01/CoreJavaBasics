package com.oopsSample;

public class AuditStudent extends Student implements PrintStudent{
	
	String classLocation;
	public AuditStudent(String name,String classLocation) {
		this.name=name;
		this.classLocation=classLocation;
	}
	public void gotoClass() {
		System.out.println("Audit Student Goto the -> "+this.classLocation);
	}
	
	public String toString() {
		String strObj="AuditStudent name is "+this.name;
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
		System.out.println("Average of AuditStudent is: "+avg);
	}

}
