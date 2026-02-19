package com.accessmodifiers;

class Default {
	
	int x =10;
	String name = "siva";
	void show() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Default d = new Default();
		
		d.show();
		System.out.println(d.name);	
		B  a = new B();
		a.test();
		
	}

}
class B{
	void test() {
		System.out.println("Test : ");
		Default a = new Default();
		System.out.println(a.x);
		a.show();
	}
}
