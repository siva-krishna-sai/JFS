package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo20 {
	
	
	static boolean isprime(int n) {
		
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
		
	}
}
