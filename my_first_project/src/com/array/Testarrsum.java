package com.array;

import java.util.Scanner;

public class Testarrsum {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " values : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int a : arr) {
			sum = sum + a;
		}
		System.out.println("Total sum: "+sum);

		sc.close();

	}

}
