package com.fundamentals.constructors;

public class Student2 {
	
	String studName;
	int rollNo;
	String course;
	
	Student2(){
		System.out.println("No arg");
	}
	
	Student2(String studName){
		System.out.println("Single constructor");
		this.studName=studName;
	}
	
	Student2(Student2 s,int rollNo){
		System.out.println("Double constructor");
		this.studName=s.studName;
		this.rollNo=rollNo;
	}
	
	Student2(Student2 s,String course){
		System.out.println("Three constructor");
		this.rollNo=s.rollNo;
		this.studName=s.studName;
		this.course=course;
	}
	
	void display() {
		System.out.println("Student Name : "+studName);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Course : "+course);
	}

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		Student2 s1 = new Student2();
		s1.display();
		
		Student2 s2 = new Student2("Siva");
		s2.display();
		
		Student2 s3 = new Student2(s2,4);
		s3.display();
		
		Student2 s4 = new Student2(s3,"JAVA");
		s4.display();
	}

}
