package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo8 {
	
	static void divisibleby5(int a) {
		int count=1;
		for(int i=1;i<=a;i++) {
			if(i%5==0) {
				System.out.println("Divisble by 5 : "+i+" Count :"+count++);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		divisibleby5(n);
		
		sc.close();
	}

}
