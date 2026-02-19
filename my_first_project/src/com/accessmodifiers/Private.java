package com.accessmodifiers;

//	private Accessmodifer is only accessbile with in the same class we cant call the outsie of the class

public class Private {
	private int x = 10;
	
	private void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		Private p = new Private();
		
		p.show(); // Allowed

	}

} 
class A{
	
	void show() {
//		here we are calling with same package but different class that why it show x  is unidentified 
//		System.out.println(x); //Not Allowed
	}
}
