package com.array;

public class Testarr_move_0_toLast {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, 0, 2, 0, 3, 0, 5 };
		int temp = 0;
		int end = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				while (arr[end] == 0 && i < end) {
					end--;
				}
				arr[i] = temp;
				arr[i] = arr[end];
				arr[end] = temp;
			}
			
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
