package com.array;

import java.util.Arrays;

public class Testarr_Array_Rotate {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int n = 4;

		arryReverse(arr, n);
		System.out.println(Arrays.toString(arr));	}

	private static void arryReverse(int[] arr, int n) {
		int start = 0;
		int end = arr.length - 1;

		arryReverse(arr, start, end);
		arryReverse(arr,start,n-1);
		arryReverse(arr,n,end);

	}

	private static void arryReverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	

}
