package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo19 {
	
	static boolean isprime(int n) {
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
		if(isprime(n)) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
		
		sc.close();
	}

}
