package com.array;

public class TestarrChar {

	public static void main(String[] args) {
		System.out.println("Main method started");
		char a[] = new char[3];
		
		a[0]='a';

		for (char n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(a.toString());
//		for char we can't print the address or reference of the variable because char is a special case 
//		in java inside println char[] is special overloaded so it will not print address or reference
//		Primitive types	int, double, char, boolean
//		Reference types (objects)	String, arrays, classes
//		int, double, char → primitives → no toString()
//		char[] → object + special overload → no toString()
//		Other arrays → object → Object.toString()
	}

}
