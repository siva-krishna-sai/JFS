package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo35 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
// Xor operator
//		a = a ^ b;
//		b = a ^ b;
//		a = a ^ b;

//normal addition and subraction
//		a = a + b;
//		b = a - b;
//		a = a - b;

//using third variable
//		int temp = a;
//		a = b;
//		b = temp;

		System.out.println("a : " + a + " b : " + b);
	}

}
