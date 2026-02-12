package com.logicaloperators;

import java.util.Scanner;

public class TestLs01 {

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a attendance percentage ");
		double attendance = sc.nextDouble();
		System.out.println("Enter a Marks ");
		double marks = sc.nextDouble();
		
		if(attendance > 80 && attendance < 100  && marks > 50 && marks < 100) {
			System.out.println("The student is eligible for scholorship of $10000");
		}else {
			System.out.println("The student is not eligible for scholorship");
		}
		
	}

}
