package com.fundamentals;

public class Data {
	
	int age = 22;
	long phoneNo= 9966598281L;
	float height = 6.2F;
	double salary = 2000000.0;
	char gender = 'M';
	boolean vcubeStudent = true;
	
	void display() {
		System.out.println("AGE : "+age);
		System.out.println("Phone No : "+phoneNo);
		System.out.println("Height : "+height);
		System.out.println("Salary : "+salary);
		System.out.println("Gender : "+gender);
		System.out.println("Vcube Student : "+vcubeStudent);
	}
	public static void main(String[] args) {
		Data d = new Data();
		d.display();
		

	}

}
