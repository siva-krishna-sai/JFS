package com.patterns;

public class Testpattern45 {

	public static void main(String[] args) {
		int space=4;
		int num=1;
		for(int i=1;i<5;i++) {
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++) {
				System.out.print(num);
			}
			space-=1;
			num+=2;
			System.out.println();
		}
	}

}
