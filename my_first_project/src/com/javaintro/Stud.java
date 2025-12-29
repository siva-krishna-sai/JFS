package com.javaintro;

public class Stud {
	
	int id ;
	String name;
	long mobileNo;
	
	void display() {
		System.out.println("********Instance Method******");
		System.out.println("Student Id : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Phone Number : "+mobileNo);
	}
	static void hello() {
		System.out.println("********Static Method*******");
		Stud s = new Stud();
		s.id = 5;
		s.name = "siva";
		s.mobileNo = 9966598281L;
		s.display();
		
		
	}

	public static void main(String[] args) {
		
		hello();

	}

}
