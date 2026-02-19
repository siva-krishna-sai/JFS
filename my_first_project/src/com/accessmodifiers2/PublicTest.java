package com.accessmodifiers2;

import com.accessmodifiers.Public;
public class PublicTest {
	public void child() {
		System.out.println("Hello public");
	}

	public static void main(String[] args) {
		
		Public p = new Public();
		p.parent();
//		p.child()//wrong way
		
		PublicTest p1 = new PublicTest();
		p1.child();//correct way
	}

}
