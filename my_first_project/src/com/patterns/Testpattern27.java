package com.patterns;

public class Testpattern27 {

	public static void main(String[] args) {
		int star = 9;
		int space = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			if (i < 5) {
				star -= 2;
				space += 1;
			} else {
				star += 2;
				space -= 1;
			}
			System.out.println();
		}

	}

}
