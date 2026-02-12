package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo38 {
	static boolean isarmstrong(int n) {
		int n1 = n;
		int temp = n;
		int count = 0;
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			count++;
		}

		while (n1 != 0) {
			r = n1 % 10; 
			n1 = n1 / 10;
			int prod = 1;
			for (int i = 1; i <= count; i++) {
				prod = prod * r;
			}
			sum = sum + prod;
		}
		
		if (temp == sum) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (isarmstrong(n)) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not a Armstrong");
		}
		
		sc.close();
	}

}
