package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo5 {
	
	static void sumofdigits(int a) {
		int sum=0;
		for(int i= 1;i<=a;i++) {
			sum = sum+i;
			System.out.println("Sum of all digits : "+i+" :"+sum);
		}
		System.out.println("***********************");
		System.out.println("Total sum :"+sum);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sumofdigits(n);
		
		sc.close();
	}

}
