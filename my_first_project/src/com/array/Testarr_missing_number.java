package com.array;

public class Testarr_missing_number {
//	find the missing in array from 1 to n
	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 4, 6, 7 };
		int n = 7;

		int expected_sum = n * (n + 1) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int total = expected_sum - sum;

		System.out.println("Missing value : " + total);
	}

}
