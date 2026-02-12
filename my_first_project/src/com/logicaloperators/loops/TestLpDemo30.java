package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo30 {

	static int factorial(int n) {
		int sum = 1;
//		for (int i = 1; i <= n; i++) {
//			sum = sum * i;
//		}
		int i = 1;
		while (i <= n) {
			sum = sum * i;
			i++;
		}
		return sum;
	}

	static boolean isStrong(int n) {
		int r = 0;
		int result = 0;
		int temp = n;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			result = result + factorial(r);
		}
		if (temp != result) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (isStrong(n)) {
			System.out.println("Given number is Strong");
		} else {
			System.out.println("Given number is not a Strong");

		}
		sc.close();

	}

}
