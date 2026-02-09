package com.array;

public class TestarrByte {

	public static void main(String[] args) {
		System.out.println("Main method started");
		byte a[] = new byte[3];

		for (byte n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(a);//prints the address of the array
	}

}
