package com.array;

import java.util.Scanner;

public class Testarr_Transpose_2d_arr {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row Size : ");
		int rows = sc.nextInt();
		System.out.println("Enter Column Size : ");
		int cols = sc.nextInt();

		System.out.println("Enter the elements : ");
		int[][] arr = new int[rows][cols];

		int[][] transpose = new int[cols][rows];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original matrix : ");
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		System.out.println("Transpose Matrix : ");
		for (int[] a : transpose) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Row Reverse the original matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Row Reverse the Transpose matrix : ");
		for (int i = 0; i < transpose.length; i++) {
			for (int j = transpose[i].length - 1; j >= 0; j--) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
