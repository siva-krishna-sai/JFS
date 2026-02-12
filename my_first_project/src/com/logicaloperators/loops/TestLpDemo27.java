package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo27 {

	static int reverse(int n) {
		int r = 0;
		int rev = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}

		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		System.out.println("Reverse Number : "+reverse(n));
		sc.close();
	}

}
