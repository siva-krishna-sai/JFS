package com.array;

public class Testarr_check_arr {
//	Check if an array is sorted.
	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 1, 1, 2, 3 };
		boolean issorted = true;

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				issorted = false;
				break;
			}
		}
		if (issorted) {
			System.out.println("Given array is sorted ");
		} else {
			System.out.println("Given array is not sorted ");
		}
	}

}
