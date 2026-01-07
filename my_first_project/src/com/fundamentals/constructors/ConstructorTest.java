package com.fundamentals.constructors;

public class ConstructorTest {
	ConstructorTest() {
        System.out.println("Before this()");
        this(10);   // ❌ intentionally NOT first
        System.out.println("After this()");
    }

    ConstructorTest(int x) {
        System.out.println("Inside parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new ConstructorTest();
    }

}
