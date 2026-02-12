package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo02 {

	static void perfect() {
		for (int j = 1; j <= 100; j++) {
			int sum=0;
			for (int i = 1; i <j; i++) {
				if (j % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == j) {
				System.out.println(j+" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number : ");
//		int n = sc.nextInt();

		perfect();

		sc.close();
	}

}
