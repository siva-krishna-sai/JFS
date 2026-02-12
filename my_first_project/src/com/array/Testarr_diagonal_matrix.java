package com.array;

import java.util.Scanner;

public class Testarr_diagonal_matrix {
//	Print diagonal elements.
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row size : ");
		int rows = sc.nextInt();

		System.out.println("Enter the cols size : ");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		System.out.println("Enter elements : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Diagonal Matrix : ");
		if (rows == cols) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (i == j) {
						System.out.print(arr[i][j] + " ");
					} else {
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Diagonal Mateix is not possible rows and cols or not equal ");
		}

	}

}
