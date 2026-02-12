package com.array;

import java.util.Scanner;

public class TestarrEven_odd_count {
	static int even_count_array(int[] n) {
		int count = 0;
		for (int a : n) {
			if (a % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	static int odd_count_array(int[] n) {
		int count = 0;
		for (int a : n) {
			if (a % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " values : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int even_count = even_count_array(arr);
		System.out.println("Even count : " + even_count);

		int odd_count = odd_count_array(arr);
		System.out.println("Odd count : " + odd_count);

		sc.close();

	}

}
