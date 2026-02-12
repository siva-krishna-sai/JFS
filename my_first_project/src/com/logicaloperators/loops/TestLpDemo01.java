package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo01 {
	

	static void findfactors(int n) {
		System.out.println("Factors of a number :");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}


	public static void main(String[] args) {

		System.out.println("Main Method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		findfactors(n);


		
		sc.close();
	}

}
