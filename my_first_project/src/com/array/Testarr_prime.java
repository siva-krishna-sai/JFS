package com.array;

import java.util.Scanner;

public class Testarr_prime {
	static boolean isprime(int n) {
		if(n==0||n==1) {
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
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			if(isprime(a)) {
				System.out.print(a+" ");
			}
		}
		sc.close();
	}

}
