package com.logicaloperators.loops;


public class TestLpDemo23 {

	static boolean  prime(int n) {
		
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		char c= 'A';
		for (int i = 1; i <= 26; i++) {
			if(prime(i)) {
				System.out.println(i+" "+c);
			}
			c++;
		}
	}

}
