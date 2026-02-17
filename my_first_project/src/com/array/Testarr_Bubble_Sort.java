package com.array;

public class Testarr_Bubble_Sort {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 10, 80, 50, 90, 0 };
//		int[] arr = { 0, 10, 50, 80, 90 };
		int count = 0;
		int count1 = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				count1++;
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}

		System.out.println("count : " + count);
		System.out.println("count1 : " + count1);

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

}
