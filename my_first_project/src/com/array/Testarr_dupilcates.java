package com.array;

public class Testarr_dupilcates {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 5, 2, 3, 7, 5, 2, 1 ,3};
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
