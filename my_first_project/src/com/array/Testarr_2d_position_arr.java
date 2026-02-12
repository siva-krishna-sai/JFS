package com.array;

public class Testarr_2d_position_arr {

	public static void main(String[] args) {
		System.out.println("main method started");
		int [][]arr = new int[2][];
		
		arr[0] = new int[3];
		arr[1] = new int[3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
