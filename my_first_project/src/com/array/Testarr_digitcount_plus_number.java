package com.array;

public class Testarr_digitcount_plus_number {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 12, 15, 133, 2 };

		for (int b : arr) {
			System.out.print(b + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int r = 0;
			int sum = 0;
			int temp = arr[i];
			while (arr[i] != 0) {
				r = arr[i] % 10;
				arr[i] = arr[i] / 10;
				count++;
			}
			sum = temp * 10 + count;
			arr[i] = sum;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
