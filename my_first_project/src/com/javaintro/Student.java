package com.javaintro;

public class Student {
	int rollNo;
	String name;
	float marks;
	char isPassed;
	
	void display() {
		System.out.println("Student Name : "+name);
		System.out.println("Student rollno : "+rollNo);
		System.out.println("Student Marks : "+marks);
		System.out.println("If student isPassed or not : "+isPassed);
	}

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();

		s.rollNo = 1;
		s.name = "siva";
		s.marks = 7.5f;
		s.isPassed = 'P';
		s.display();
		System.out.println("***************************");
		s1.rollNo++;
		s1.name = "sai";
		s1.marks = 8;
		s1.isPassed = 'P';
		s1.display();
		System.out.println("***************************");
		s2.rollNo++;
		s2.name = "krish";
		s2.marks = 4;
		s2.isPassed = 'F';
		s2.display();
		
		
		
	}

}
