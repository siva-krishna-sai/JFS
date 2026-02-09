package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo37 {

	static int sum(int n) {
		int sum = 0;
		int r = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}

		return sum;
	}

	static int mul(int n) {
		int mul = 1;
		int r = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			mul = mul * r;
		}

		return mul;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (sum(n) == mul(n)) {
			System.out.println("It is Spy number ");
		} else {
			System.out.println("It is not a spy number");
		}

		sc.close();
	}

}
