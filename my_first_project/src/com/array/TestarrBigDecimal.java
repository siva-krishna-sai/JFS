package com.array;

import java.math.BigDecimal;


public class TestarrBigDecimal {

	public static void main(String[] args) {
		System.out.println("Main method started");
		BigDecimal a[] = new BigDecimal[3];

		for (BigDecimal n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(a);//prints the address of the array
	}

}
