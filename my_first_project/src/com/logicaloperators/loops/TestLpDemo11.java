package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo11 {

	static int countofdigits(int n) {
		int count=0;
		if(n==0) {
			count=1;
		}
			for(;n!=0;n=n/10) {
				count++;
			}
		
		return count;
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
