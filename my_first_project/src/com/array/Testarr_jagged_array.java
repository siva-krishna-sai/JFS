package com.array;

public class Testarr_jagged_array {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		int [][]arr = {{10,20,30,50,60},{10,20,40}};
		
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
