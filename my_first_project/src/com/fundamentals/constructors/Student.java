package com.fundamentals.constructors;

public class Student {
	
	int id;
	String name;
	String branch;
	int marks;
	
	Student(int id, String name, String branch, int marks){
		System.out.println("Parametrized constructors !!");
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		
		Student s = new Student(101,"siva","CSE",100);
		s.display();
		
		Student s1 = new Student(102,"sai","ECE",10);
		s1.display();
		
		Student s2 = new Student(103,"nani","EEE",90);
		s2.display();
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(branch);
		System.out.println(marks);
	}

}
