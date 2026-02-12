package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo26 {
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;
	static int count=2;
	static int  fibonacci(int n) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			count++;
		return n3;	
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the postion of number: ");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println(n+" postion is : 0");
		}
		else if(n==2) {
			System.out.println(n+" postion is : 1");
		}
		else {
		for (int i = 3; i <= n; i++) {
			int n1=fibonacci(n);
			if(count==n) {
				System.out.println(n+" postion is : "+n1);
				break;
			}
		}
		}
		sc.close();
	}

}
