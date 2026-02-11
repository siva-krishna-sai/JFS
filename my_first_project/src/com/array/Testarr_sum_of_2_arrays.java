package com.array;

public class Testarr_sum_of_2_arrays {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] a = { 10, 20, 30 };
		int[] b = { 40, 30, 20, 50 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			
		}
		for(int n : c) {
			System.out.print(n+" ");
		}
	}

}
