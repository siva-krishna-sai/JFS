package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo33 {

	static void pattern1(int n) {
		for (int i = n; i >= 1; i--) {
			int count=5;
			for (int j = 1; j <= i; j++) {
					System.out.print(" "+count--);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		pattern1(n);
		sc.close();
	}

}
