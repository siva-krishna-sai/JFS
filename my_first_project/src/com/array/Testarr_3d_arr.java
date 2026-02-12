package com.array;

public class Testarr_3d_arr {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[][][] arr = new int[3][3][3];
		
		for(int [][]a:arr) {
			for(int []b:a) {
				for(int c:b) {
					System.out.print(c+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
