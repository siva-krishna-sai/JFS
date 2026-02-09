package com.array;

public class TestarrDouble {

	public static void main(String[] args) {
		System.out.println("Main method started");
		double a[] = new double[3];

		for (double n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(a);//prints the address of the array
	}

}
