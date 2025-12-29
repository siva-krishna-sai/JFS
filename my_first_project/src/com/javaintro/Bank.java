package com.javaintro;

public class Bank {
	static int account_No= 12301;
	String account_Holder_Name;
	Double balance;
	void Display(){
		System.out.println("Account No :"+account_No);
		System.out.println("Account Holder Name :"+account_Holder_Name);
		System.out.println("Balance :"+balance);
		System.out.println("---------------");
	}
	public static void main(String[] args) {
		System.out.println("Bank Details");
		Bank B = new Bank();
		B.account_Holder_Name = "Siva";
		B.balance = 20000.00;
		B.Display();
		
		account_No++;
		B.account_Holder_Name = "Ravi";
		B.balance = 30000.00;
		B.Display();
		
		account_No++;
		B.account_Holder_Name = "Sai";
		B.balance = 40000.00;
		B.Display();
	}

}
