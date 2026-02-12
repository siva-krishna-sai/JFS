package com.array;

public class Testarr_2d_arr_string {

	public static void main(String[] args) {
		System.out.println("main method started");
		String[][] arr = new String[2][2];

		arr[0][0] = "sai";
		arr[0][1] = "siva";

		arr[1][0] = "sai";
		arr[1][1] = "siva";

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//		}

		for (String[] a : arr) {
			for (String b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
