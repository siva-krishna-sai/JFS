package com.array;

public class Testarr_target_pairs {

	public static void main(String[] args) {
		System.out.println("Main method started");

		int[] arr = { 2, 3, 4, 1, 5, 8, 6, 7 };
		int target = 9;

		for (int i = 0; i < arr.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minindex]) {
					minindex = j;
				}

			}
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("[" + arr[i] + "," + arr[j] + "]");
				}
			}
		}
	}
}
