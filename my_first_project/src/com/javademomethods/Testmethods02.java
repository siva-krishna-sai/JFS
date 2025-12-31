package com.javademomethods;

import java.util.Scanner;

public class Testmethods02 {

	 void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b = sc.nextDouble();
		
		double sum1 = getAddition(a,b);
		System.out.println("Addition of a and b is : "+sum1);
		double sub1=getSubraction(a,sum1);
		System.out.println("Subraction of a and b is :"+sub1);
		double mul1 =getMultiplication(a,sub1);
		System.out.println("Multiplication of a and b is :"+mul1);
		
		
		sc.close();
	}
	
	double getAddition(double a , double b) {
		double sum = a+b;
		return sum;
	}
	
	double getSubraction(double sum, double a) {
		double sub = a-sum;
		return sub;
	}
	double getMultiplication(double a, double sub) {
		double mul = a*sub;
		return mul;
	}

}
