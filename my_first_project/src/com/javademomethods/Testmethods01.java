package com.javademomethods;

import java.math.BigDecimal;
import java.util.Scanner;

public class Testmethods01 {

	public static void main(String[] args) {
		
		Testmethods01 t = new Testmethods01();
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the First Name : ");
//		String fn = sc.nextLine();
//		System.out.println("Enter the Last Name : ");
//		String ln = sc.next();
//		
//		t.getName(fn,ln);
//		
//		System.out.println("Enter the age : ");
//		int age = sc.nextInt();
//		
//		t.getAge(age);
//		
//		System.out.println("Enter the Height : ");
//		double h = sc.nextDouble();
//		
//		t.getHeight(h);
		
//		System.out.println("Enter the Gender : ");
//		char g = sc.next();
		
//		System.out.println("Enter the Phone Number : ");
//		long ph = sc.nextLong();
//		
//		t.getPNumber(ph);
		
//		System.out.println("Enter the Pincode : ");
//		short pc = sc.nextShort();
//		
//		t.getPincode(pc);
		
//		System.out.println("Enter the Country Code : ");
//		byte cc = sc.nextByte();
//		
//		t.getCountrycode(cc);
		
//		System.out.println("Enter the weight : ");
//		float w = sc.nextFloat();
//		
//		t.getWeight(w);
		
		System.out.println("Enter the confirmation : ");
		boolean c = sc.nextBoolean();
		
		t.getConfirmation(c);
		
	}
	
	void getName(String fname, String lname) {
		String fullname = fname +" "+ lname;
		System.out.println("Full name of the person : "+fullname);
	}
	
	void getAge(int age) {
		System.out.println("Age of the person : "+age);
	}
	
	void getHeight(double height) {
		System.out.println("Height : "+height);
	}
	
	void getGender(char gender) {
		System.out.println("Gender : "+gender);
	}
	
	void getPNumber(long PhNumber) {
		System.out.println("Phone Number : "+PhNumber);
	}
	
	void getPincode(short pincode) {
		System.out.println("Pin Code : "+pincode);
	}
	
	void getCountrycode(Byte countrycode) {
		System.out.println("Country Code : "+countrycode);
	}
	
	void getWeight(float weight) {
		System.out.println("Weight : "+weight);
	}
	
	void getConfirmation(boolean confirm) {
		System.out.println("The above information : "+confirm);
	}
	

}
