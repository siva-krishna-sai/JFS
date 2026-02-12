package com.array;

public class Testarr_second_largest {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 10, 20, 50, 30, 0, 90 };
		int largest = arr[0];
		int second = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			}
		}
		System.out.println("Second Largest Number : " + second);
	}

}
