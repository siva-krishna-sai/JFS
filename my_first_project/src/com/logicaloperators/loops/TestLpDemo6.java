package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo6 {
	
	static void sumofeven(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				sum=sum+i;
				System.out.println("Even Number : "+i+" sum :"+sum);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		sumofeven(n);
		
		sc.close();
	}

}
