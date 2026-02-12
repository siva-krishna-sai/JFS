package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo17 {

	static boolean isPrime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= 50; i++) {
			if (isPrime(i)) {
				count++;
				if (count == n) {
					System.out.print("Postion "+n+" is "+i);
				}
			}
		}
		
		sc.close();
	}

}
