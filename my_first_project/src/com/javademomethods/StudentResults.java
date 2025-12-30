package com.javademomethods;


import java.util.Scanner;

public class StudentResults {
	
	double total;
	
	public static void main(String[] args) {
		System.out.println("Student Result");
		StudentResults s = new StudentResults();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the english marks : ");
		double en = sc.nextDouble();
		System.out.println("Enter the telugu marks : ");
		double te = sc.nextDouble();
		System.out.println("Enter the Maths marks : ");
		double ma = sc.nextDouble();
		System.out.println("Enter the science marks : ");
		double se = sc.nextDouble();
		System.out.println("Enter the social marks : ");
		double so = sc.nextDouble();
		
		s.averageMarks(en,te,ma,se,so);
		
	}
	
	void totalMarks(double english, double telugu, double maths, double science, double social) {
		total = english + telugu + maths + science + social;
		System.out.println("Total Marks of a student : "+total);
	}
	
	void averageMarks(double english, double telugu, double maths, double science, double social) {
		totalMarks(english,telugu,maths,science,social);
		double avg = total/5;
		System.out.println("Avgerage of the total marks : "+avg);
		
	}
	
	
}

