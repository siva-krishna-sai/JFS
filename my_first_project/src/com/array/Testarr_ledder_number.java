package com.array;

public class Testarr_ledder_number {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int ledder = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (ledder <= arr[i]) {
				ledder = arr[i];
				System.out.print(ledder + " ");
			}
		}
	}
}
