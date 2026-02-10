package com.array;

public class Testarrindexpostion {

	public static void main(String[] args) {
		System.out.println("main method started");
		int arr[] = { 1, 2, 3, 4, 5 };
//		for (int i = 0; i < arr.length; i = i + 2) {
//			arr[i] = arr[i] * arr[i];
//		}
//		for (int i = 1; i < arr.length; i = i + 2) {
//			arr[i] = arr[i] * 2;
//		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				arr[i] = arr[i] * arr[i];
			}else {
				arr[i] = arr[i] * 2;
			}
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
