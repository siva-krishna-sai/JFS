package com.array;

public class Testarr_2d_arr {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		int [][]arr = {{10,20,30},{10,20,40}};
		System.out.println(arr);
		
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
