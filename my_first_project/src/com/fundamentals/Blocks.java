package com.fundamentals;

public class Blocks {
	
	static {
		System.out.println("Static Block1");
	}
	static {
		System.out.println("Static Block2");
	}
	
	{
		System.out.println("Instance Block");
	}
	public static void main(String[]args) {
		Blocks b = new Blocks();
		
		
	}
}
