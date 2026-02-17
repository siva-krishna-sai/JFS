package com.array;

import java.util.Arrays;

public class Testarr_Rotation {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 13, 7, 9, 20, 10, 19, 7 };

		int middle = arr.length / 2;

		System.out.println(middle);

		arrayRotate(arr, middle);
		System.out.println(Arrays.toString(arr));
	}

	private static void arrayRotate(int[] arr, int middle) {
		int start = 0;
		int end = arr.length - 1;

		arrayRotate(arr, start, middle - 1);
		arrayRotate1(arr, middle, end);

	}

	private static void arrayRotate1(int[] arr, int start, int end) {
		while (start < end) {
			if (arr[start] < arr[end]) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
			start++;
			end--;
		}
	}

	private static void arrayRotate(int[] arr, int start, int end) {

		for (int i = start; i <= end; i++) {
	        for (int j = i + 1; j <= end; j++) {
	            if (arr[i] > arr[j]) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	}
}
