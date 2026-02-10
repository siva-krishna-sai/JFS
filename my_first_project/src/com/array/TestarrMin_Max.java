package com.array;

public class TestarrMin_Max {

	public static void main(String[] args) {
		System.out.println("main method started");
		int arr[] = { 5, 4, 3, 2, 1, 0 };
		int min = arr[0];
		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (min > arr[i]) {
//				min = arr[i];
//			} else if (max < arr[i]) {
//				max = arr[i];
//			}
//		}
		
		for (int a :arr) {
			if (min > a) {
				min = a;
			} else if (max < a) {
				max = a;
			}
		}
		System.out.println("Minimum value : " + min);
		System.out.println("Maximum value : " + max);
	}
}
