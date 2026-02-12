package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo9 {
	static int product(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
			System.out.println("i : "+i +" sum: "+sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int sum=product(n);
		System.out.println("result : "+sum);
		sc.close();
	}

}
