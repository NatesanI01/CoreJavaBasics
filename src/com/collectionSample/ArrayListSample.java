package com.collectionSample;
import com.oopsSample.*;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		Student s1=new PayingStudent("peter",8.5f);
		Student s2=new CompanyStudent("Sam","Zuci");
		Student s3=new AuditStudent("Esakki","Zuci");
		Student s4=new AuditStudent("Sanjay","Zuci");
		Student s5=new CompanyStudent("Siddque","Zuci");
		Student s6=new PayingStudent("Sreeram",8.5f);
		ArrayList<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(2, s6);
		students.remove(2);
		
		for (Student a:students) {
			System.out.println(a);
			
			
		}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					

	}

}
