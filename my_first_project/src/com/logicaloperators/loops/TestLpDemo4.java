package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo4 {
	
	static void multiply(int n) {
		for(int i=1;i<=10;i++) {
			int s=n*i;
			System.out.println(n+" * "+i + " = "+s);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		
		multiply(n);
		
		sc.close();
		
	}
}
