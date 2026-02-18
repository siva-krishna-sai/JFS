package com.patterns;

public class Testpattern42 {

	public static void main(String[] args) {
		int space=4;
		char c = 'A';
		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			for (int k = 1; k <= space; k++) {
//				System.out.print(c);
//			}
//			space--;
//			c++;
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.print(j);
				}else {
					System.out.print(c);
				}
			}
			c++;
			System.out.println();
		}
	}

}
