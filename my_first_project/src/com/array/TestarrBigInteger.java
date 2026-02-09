package com.array;

import java.math.BigInteger;

public class TestarrBigInteger {

	public static void main(String[] args) {
		System.out.println("Main method started");
		BigInteger a[] = new BigInteger[3];

		for (BigInteger n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(a);//prints the address of the array
	}

}
