package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog{
	
}
public class Demo {
	
	String name = "siva";//the string value should be stored in SCP-> it is in heap
	String name1 = new String("V cube");//heap
	//note: this is used to convert the primitive type to wrapped object data type-->Auto-boxing
//	Integer i1 = 100;
	Integer i1 = Integer.valueOf(100);//for every numerical data RHS is known as int so we need to convert int to integer
//	int i2 = i1;
	int i2 = i1.intValue();//Converting from wrapper to primitive-->Auto unboxing
	
	Long l = 9966598281L;
	
	Float f = 56.5f;
	Double d1 = 5948.34;
	Character c = 85;
	
	BigInteger bi1 = new BigInteger("8548555525822158521555562555");
	BigInteger bi2 = new BigInteger("8548555525822158521555562555");
	
	BigDecimal bd1 = new BigDecimal("5873458709570534573.3569896");
	BigDecimal bd2 = new BigDecimal("5873458709570534573.3569896");
	
//	Dog d = "puppy";

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		Demo D = new Demo();
//		System.out.println(D.name);
//		System.out.println(D.name1);
//
//		System.out.println(D.i1);
//		System.out.println(D.i1);
//		
//		System.out.println(D.l);
//		
//		System.out.println(D.f);
//		System.out.println(D.d1);
//		
//		System.out.println(D.c);
		
//		System.out.println("*****************Big Integer**************");
//		System.out.println(D.bi1);
//		System.out.println(D.bi2);
//		System.out.println("*****************Add**************");
//		System.out.println(D.bi1.add(D.bi2));
//		System.out.println("*****************Multiply**************");
//		System.out.println(D.bi1.multiply(D.bi2));
//		System.out.println("*****************Divide**************");
//		System.out.println(D.bi1.divide(D.bi2));
//		System.out.println("*****************Modulus**************");
//		System.out.println(D.bi1.mod(D.bi2));
//		System.out.println("*****************Modulus**************");
//		System.out.println(D.bi1.mod(D.bi2));
//		System.out.println("*****************Subtarct*************");
//		System.out.println(D.bi1.subtract(D.bi2));
//		
//		
//		
//		System.out.println("*****************Big Decimal**************");
//		System.out.println(D.bd1);
//		System.out.println(D.bd2);
//		System.out.println("*****************Add**************");
//		System.out.println(D.bd1.add(D.bd2));
//		System.out.println("*****************Multiply**************");
//		System.out.println(D.bd1.multiply(D.bd2));
//		System.out.println("*****************Divide**************");
//		System.out.println(D.bd1.divide(D.bd2));
//		System.out.println("*****************Subtract*************");
//		System.out.println(D.bd1.subtract(D.bd2));
//		
		
		
//		System.out.println(D.d);
		
	}

}
