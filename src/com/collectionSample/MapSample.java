package com.collectionSample;
import java.util.HashMap;

import com.oopsSample.*;
public class MapSample {

	public static void main(String[] args) {
		HashMap<Integer,Student> students=new HashMap<>();
		Student s1=new PayingStudent("Sanjay",8.5f);
		Student s2=new CompanyStudent("Sam","Zuci");
		Student s3=new AuditStudent("Esakki","Zuci");
		Student s4=new AuditStudent("Sanjay","Zuci");
		Student s5=new CompanyStudent("Siddque","Zuci");
		Student s6=new PayingStudent("Sreeram",8.5f);
		students.put(100, s1);
		students.put(101, s2);
		students.put(102, s3);
		students.put(103, s4);
		students.put(104, s5);
		students.put(105, s6);
		for(int i=100;i<=105;i++)
		{
			System.out.println(students.get(i));
		}
	}

}
