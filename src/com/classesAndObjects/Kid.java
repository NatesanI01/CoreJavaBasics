package com.classesAndObjects;

public class Kid {
	
	static String studyClass="KinderGarden";
	public String name;
	public int age;
	
	public Kid(String name,int age) {
		this.name=name;
		this.age=age;
			
	}
	public void play() {
		System.out.println(this.name+ " is playing...");
		
	}
	public void printKid(String name) {
		System.out.println("Name of Kid is: "+this.name);
	}
	public void printKid(int studying) {
		System.out.println("Kid is studying in: "+studying);
	}
	public void printKid(String name,int age) {
		System.out.println("Name of Kid is: "+name+" and Age is: "+age);
	}

}
