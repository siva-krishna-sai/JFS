package com.array;

public class TestarrString {

	public static void main(String[] args) {
		System.out.println("Main method started");
		String[] names = new String[4];

		names[0] = "siva";
		names[1] = "krishna";
		names[2] = "sai";

		for (String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println(names);
	}

}
