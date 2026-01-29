package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo3 {

	static void square(int n) {
		for(int i=1;i<=n;i++) {
			int s = i * i;
			System.out.print(" "+s);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		square(n);
		
		sc.close();
	}

}
