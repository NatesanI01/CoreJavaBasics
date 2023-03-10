package com.oopsSample;

public abstract class Student implements PrintStudent{
	String name;
	String address;
	float gpa;
	
//	public Student(String name) {
//		this.name=name;
//	}
	
	public Student() {
		
	}
	
//	public Student(String name,float gpa)
//	{
//		this.name=name;
//		this.gpa=gpa;
//	}
	
//	public void gotoClass() {
//		System.out.println("Student goto class... "+this.name);
//
//	}
	
	public final void calculateGPA() {
		System.out.println("Calculate GPA");
	}
	
	public abstract void gotoClass();

}
