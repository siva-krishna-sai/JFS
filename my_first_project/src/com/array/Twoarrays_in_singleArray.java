package com.array;

import java.util.Arrays;

public class Twoarrays_in_singleArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[] arr1 = { 4, 5, 6, 7 };
		int[] c = new int[arr.length + arr1.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			c[index++] = arr[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			c[index++] = arr1[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
