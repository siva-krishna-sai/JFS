package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo22 {
	
	static int find_fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}

		return n*find_fact(n-1);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = find_fact(n);
		System.out.println(a+" ");
		
		sc.close();
		
	}

}
