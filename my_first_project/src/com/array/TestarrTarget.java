package com.array;

public class TestarrTarget {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[] = { 123, 225, 279, 112 };
		int target = 2;
		int r = 0;
		int count = 0;
		for (int a : arr) {
			while (a != 0) {
				r = a % 10;
				a = a / 10;
				if (r == target) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
