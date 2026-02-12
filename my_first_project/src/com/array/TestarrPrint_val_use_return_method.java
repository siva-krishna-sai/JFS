package com.array;

import java.util.Scanner;

public class TestarrPrint_val_use_return_method {

	static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " values : ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = getArray();

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
