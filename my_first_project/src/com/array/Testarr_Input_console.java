package com.array;

import java.util.Scanner;

public class Testarr_Input_console {
//	Input from console
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row size : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the cols size : ");
		int cols = sc.nextInt();
		
		int[][]arr=new int[rows][cols];
		
		System.out.println("Enter elements : ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
