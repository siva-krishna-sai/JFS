package com.fundamentals.constructors;

public class Student1 {
	
	int rollNumber;
	String name;
	String branch;
	
	Student1(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	Student1(Student1 s,String branch){
		this.rollNumber=s.rollNumber;
		this.name=s.name;
		this.branch=branch;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Student1 s1 = new Student1(04,"siva");
		s1.show();
		
		Student1 s2 = new Student1(s1,"CSE");
		s2.show();
	}
	
	void show() {
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("***************************");
	}

}
