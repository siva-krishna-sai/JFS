package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo12 {

	static int countofdigits(int n) {
		int sum=0;
		if(n==0) {
			sum=1;
		}
			for(;n!=0;n=n/10) {
				int i=n%10;
				sum=sum+i;
			}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int count=countofdigits(n);
		System.out.println(count);
		sc.close();
	}

}
