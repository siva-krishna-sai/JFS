package com.array;

public class Testarr_frquency_of_element {
//	Find the frequency of each element.
	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 1, 1, 2, 3 };
		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if (count > 1) {
				System.out.println(arr[i] + "-->" + count);
			}
		}

	}

}
