package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo28 {

	static boolean isArmstrong(int n) {
		int r = 0;
		int sum = 0;
		int temp1 = n;
		String temp = Integer.toString(n);

		int n1 = temp.length();

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(r, n1));
		}
		if (sum != temp1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (isArmstrong(n)) {
			System.out.println("Given nuumber is armstrong");
		} else {
			System.out.println("Given nuumber is not armstrong");
		}

		sc.close();
	}
}
