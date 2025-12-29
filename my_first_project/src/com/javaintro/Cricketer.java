package com.javaintro;

public class Cricketer {

	static int countryId;
	static String countryName;
	
	int jersyNo;
	String jersyName;
	
	public static void main(String[] args) {
		System.out.println("Indian Cricket Team !!!!");
		
		countryId = 91;
		countryName = "India";
		
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name: "+countryName);
		
		// creating an object
		// LHS = Cricketer is a class vk is the reference variable of the object
		// RHS = new is the keyword is to create the object with help of constructor, Cricketer is the constructor.
		// = is a assignment operator
		Cricketer vk = new Cricketer();
		
		vk.jersyNo = 18;
		vk.jersyName = "Virat Kohili";
		
		System.out.println("Jersy Number: "+vk.jersyNo);
		System.out.println("Jersy Name: "+vk.jersyName);
		

	}

}
