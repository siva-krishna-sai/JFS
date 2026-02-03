package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo29 {
	static boolean ispalindrome(int n) {
		int r = 0;
		int rev = 0;
		int temp = n;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}

		if (rev != temp) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (ispalindrome(n)) {
			System.out.println("Given nuumber is Palindrome");
		} else {
			System.out.println("Given nuumber is not Palindrome");
		}

		sc.close();
	}

}
