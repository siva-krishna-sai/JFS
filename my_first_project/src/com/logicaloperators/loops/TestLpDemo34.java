package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo34 {
	static int sumofEvenOdd(int n) {
		int r = 0;
		int evsum = 0;
		int odsum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			if (r % 2 == 0) {
				evsum = evsum + r;
			} else {
				odsum = odsum + r;
			}
		}
		return evsum - odsum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sumofEvenOdd(n);
		System.out.println(sum);
		sc.close();
	}

}
