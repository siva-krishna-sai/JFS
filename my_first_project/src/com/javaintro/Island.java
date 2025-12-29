//package com.javaintro;
//
////class Student {
//	
//	protected void finalize() {
//		System.out.println("Final Called");
//	}
//	Student friend;
//}
//
//
//public class Island {
//	
//
//
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//
//		
//		s1.friend = s2;
//		s2.friend = s1;
//		
//		s1 = null;
//		s2 = null;
//		System.gc();
//
//	}
//
//}
