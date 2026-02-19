package com.logicaloperators.loops;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		int prod = n * n;
		while (prod > 0) {
			r = prod % 10;
			prod = prod / 10;
			sum = sum + r;
		}
		if (n == sum) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not a Neon Number");
		}
		sc.close();
	}
}
