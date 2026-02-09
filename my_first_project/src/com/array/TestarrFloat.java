package com.array;

public class TestarrFloat {

	public static void main(String[] args) {
		System.out.println("Main method started");
		float a[] = new float[3];

		for (float n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(a);//prints the address of the array
	}

}
