package com.accessmodifiers;

public class Public {

	public void parent() {
		System.out.println("Hello public");
	}
	public static void main(String[] args) {
		Public p = new Public();
		p.parent();
	}

}
