package com.array;

public class Testarr_copy_one_to_another {
	
//	Copy one array into another.

	public static void main(String[] args) {
		System.out.println("main method started");

		int a[] = { 10, 20, 30 };
		int[] b = new int[a.length];
		
		for(int i =0;i<a.length;i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
	}

}
