package com.accessmodifiers;

public class Protected {
	
	protected int x =10;
	protected String name = "sai";
	
	void show() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Protected p = new Protected();
		
		p.show();
		
		C c = new C();
		c.test();
		

	}

}
class C{
	void test() {
		System.out.println("Test : ");
		Default a = new Default();
		System.out.println(a.x);
		a.show();
	}
}
