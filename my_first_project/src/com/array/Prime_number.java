package com.array;

import java.util.Arrays;

public class Prime_number {

	static boolean isprime(int a) {

		if (a == 0 || a == 1) {
			return false;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 11, 14, 13, 17, 21, 2, 4 };
		int[] b = new int[arr.length - 1];
		int index = 0;
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			int sum = 0;
			if (isprime(a)) {
				while (a > 0) {
					r = a % 10;
					a = a / 10;
					sum = sum * 10 + r;
				}
				if (isprime(sum)) {
					b[index++] = arr[i];
				}
			}
		}
		System.out.println("Before Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Array :");
		System.out.println(Arrays.toString(Arrays.copyOf(b, index)));
	}
}
