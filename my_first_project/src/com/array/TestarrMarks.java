package com.array;

public class TestarrMarks {

	public static void main(String[] args) {
		System.out.println("main methos started");
		int arr[] = { 70, 80, 98, 75, 50 };
		double totalmarks = 0;
		double avg = 0;

//		for (int i = 0; i < arr.length; i++) {
//			totalmarks = totalmarks + arr[i];
//		}
		for (int a : arr) {
			totalmarks = totalmarks + a;
		}

		avg = totalmarks / arr.length;
		System.out.println(totalmarks);
		System.out.println(avg);

	}

}
