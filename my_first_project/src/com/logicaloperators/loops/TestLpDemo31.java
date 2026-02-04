package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo31 {
	static void binary(int n) {
		int r = 0;
		int temp=n;
		String b = "";
		while (n != 0) {
			r = n % 2;
			n = n / 2;
			b = r + b;
		}
		System.out.println(temp+" Binary Value : "+b);
	}

	public static void main(String[] args) {
		System.out.println("main method stared");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal Value : ");
		int n = sc.nextInt();
		binary(n);
		sc.close();
	}

}
