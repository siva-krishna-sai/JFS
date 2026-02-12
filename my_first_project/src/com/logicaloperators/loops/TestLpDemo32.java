package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo32 {

	static int binarytoDecimal(int n) {
		int r = 0;
		int sum = 0;
		int power = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * ((int) Math.pow(2, power));
			power++;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Value : ");
		
		int n = sc.nextInt();

		System.out.println("Decimal Value : "+binarytoDecimal(n));
		sc.close();
	}

}
