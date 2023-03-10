package com.oopsSample;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {
//		Student s1=new Student("Peter");
		Student s1=new PayingStudent("Peter",9.5f);
		Student s3=new PayingStudent("Vicky",8.7f);
		Student s2=new CompanyStudent("John","Zuci");
		Student s4=new CompanyStudent("Raj","Zuci");
		Student s5=new AuditStudent("Sanjay","Auditorium 1");
		Student s6=new AuditStudent("Sree","Auditorium 2");
		StudentList students=new StudentList();
		students.addStudent(s1);
		students.addStudent(s2);
		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		students.addStudent(s6);
		
		ArrayList<Student> studs=students.getStudents();
		for(Student stud:studs) {
			System.out.println(stud.toString());
			stud.gotoClass();
			stud.calculateGPA();
			stud.printMarksheet();
		}
	}

}
