package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo21 {
	
	static int find_fact(int n) {
		int fact=1;
		if(n==0 || n==1) {
			return 1;
		}
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		return fact;
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
