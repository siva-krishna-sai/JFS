package com.array;

public class Testarr_sum_of_row {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int[][] arr = new int[2][3];

		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;

		arr[1][0] = 1;
		arr[1][1] = 1;
		arr[1][2] = 1;
		
		
		for(int []a:arr) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =0;i<arr.length;i++) {
			int sum = 0;
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				sum = sum+arr[i][j];
			}
			System.out.println(sum);
		}
	}

}
