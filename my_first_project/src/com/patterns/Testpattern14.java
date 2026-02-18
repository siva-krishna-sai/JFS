package com.patterns;

public class Testpattern14 {

	public static void main(String[] args) {

//		Pascal Triangle
//			1
//	       1 1
//	      1 2 1
//	     1 3 3 1
//	    1 4 6 4 1

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			int val = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(val+" ");
				val = val * (i - k) / (k + 1);
			}
			System.out.println();
		}

	}
}
