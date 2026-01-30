package com.logicaloperators.loops;

public class TestLpDemo16 {

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
		int count = 0;
		for (int i = 0; i <= 50; i++) {
			if (isPrime(i)) {
				count++;
				if (count % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
