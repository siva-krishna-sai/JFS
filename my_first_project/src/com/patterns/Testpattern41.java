package com.patterns;

public class Testpattern41 {

	public static void main(String[] args) {
		char c= 'A';
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+c);
			}
			c++;
			System.out.println();
		}
	}

}
