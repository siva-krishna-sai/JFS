package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo7 {
	
	static void sumofodd(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				sum=sum+i;
				System.out.println("Odd Number : "+i+" sum :"+sum);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		sumofodd(n);
		
		sc.close();
	}

}
