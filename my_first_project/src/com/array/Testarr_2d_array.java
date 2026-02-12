package com.array;

public class Testarr_2d_array {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[][] arr = new int[3][3];

		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;

		arr[1][0] = 104;
		arr[1][1] = 105;
		arr[1][2] = 106;

		arr[2][0] = 101;
		arr[2][1] = 101;
		arr[2][2] = 101;

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//		}

		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
