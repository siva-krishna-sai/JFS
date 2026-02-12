package com.array;

public class TestarrShort {

	public static void main(String[] args) {
		System.out.println("Main method started");
		short a[] = new short[3];

		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println(a);// prints the address of the array
	}

}
