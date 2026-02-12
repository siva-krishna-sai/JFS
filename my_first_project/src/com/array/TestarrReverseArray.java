package com.array;

public class TestarrReverseArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		int arr[] = { 5, 4, 3, 2, 1, 0 };
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}

		int start = 0;
		int end = arr.length - 1;
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
