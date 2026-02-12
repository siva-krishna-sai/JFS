package com.array;

import java.util.Scanner;

public class Testarr_String_target {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int n = sc.nextInt();
		System.out.println("Enter the String data : ");
		String[] s = new String[n];

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}

		for (String name : s) {
			if (name.toLowerCase().contains("h")) {
				System.out.println(name);
			}
		}
		sc.close();
	}

}
