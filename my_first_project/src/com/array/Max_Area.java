package com.array;

import java.util.Arrays;

public class Max_Area {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 6, 4, 8, 7 };
		int[] a = new int[arr.length];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int j = i;
			while (j >= 0) {
				if (arr[i] <= arr[j]) {
					count++;
				} else {
					break;
				}
				j--;
			}
			int k = i + 1;
			while (k < arr.length) {
				if (arr[i] <= arr[k]) {
					count++;
				} else {
					break;
				}
				k++;
			}
			a[i] = arr[i] * count;
		}
		
		System.out.println("Areas :");
		System.out.println(Arrays.toString(a));
		for (int b : a) {
			if (max < b) {
				int temp = b;
				b = max;
				max = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) {
				System.out.println("Index : " + i);
			}
		}
		System.out.println("Max Value : " + max);
	}
}
