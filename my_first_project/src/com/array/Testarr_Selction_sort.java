package com.array;

import java.util.Arrays;

public class Testarr_Selction_sort {

	public static void main(String[] args) {
		System.out.println("Main method started");

		int[] arr = { 5, 8, 9, 4, 3, 2, 7 };
		
		for(int i = 0;i<arr.length;i++) {
			int minindex = i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[minindex]) {
					minindex = j;
				}
				
			}
			int temp = arr[minindex];
			arr[minindex]=arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
