package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo10 {
	
	static void reversenumber(int n){
		for(int i=n;i>=0;i--) {
			System.out.print(" "+i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		reversenumber(n);
		
		sc.close();
	}

}
