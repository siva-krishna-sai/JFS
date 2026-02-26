package com.array;

import java.util.Arrays;

public class Max_profit {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 1, 2, 27, 13, 7 };

		int min = Integer.MAX_VALUE;
		int max_profit = 0;
		int profit = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			profit = arr[i] - min;
			if (profit > max_profit) {
				max_profit = profit;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Max Profit : " + max_profit);
	}
}
