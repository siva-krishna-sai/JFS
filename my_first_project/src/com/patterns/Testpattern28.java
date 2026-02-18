package com.patterns;

public class Testpattern28 {

	public static void main(String[] args) {
		int ash = 1;
		int star = 1;
		int space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			for (int k = 1; k <= ash; k++) {
				System.out.print("#");
			}
			star++;
			ash++;
			space--;
			System.out.println();
		}
	}

}
