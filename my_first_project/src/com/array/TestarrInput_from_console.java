package com.array;

import java.util.Scanner;

public class TestarrInput_from_console {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n :");
		int n = sc.nextInt();
		int n1[] = new int[n];
		System.out.println("Enter " + n + " values : ");
		for (int i = 0; i < n; i++) {
			n1[i] = sc.nextInt();
		}
		for (int x : n1) {
			System.out.print(x + " ");
		}
		
		sc.close();
		
	}

}
