package com.array;

import java.util.Scanner;

public class TestarrPrint_val_use_method {
	
	static void printArray(int[]a) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int arr[]=new int[3];
			
		printArray(arr);
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
