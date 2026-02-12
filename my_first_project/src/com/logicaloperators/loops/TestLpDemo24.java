package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo24 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 ;
		System.out.print(n1+" "+n2);
		for (int i = 1; i <= n-2; i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}

}
