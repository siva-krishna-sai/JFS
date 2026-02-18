package com.patterns;

public class Testpattern43 {

	public static void main(String[] args) {
		char c = 'A';
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i > j && i != 1) {
					System.out.print(c);
					c++;
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
