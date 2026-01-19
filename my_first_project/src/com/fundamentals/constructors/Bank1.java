package com.fundamentals.constructors;

class BankTest {
	
	int accountNo;
	String accountHolderName;
	double balance;
	
	BankTest(int accountNo,String accountHolderName, double balance){
		this.accountNo=accountNo;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	
	BankTest(BankTest b){
		this.accountNo=b.accountNo;
		this.accountHolderName=b.accountHolderName;
		this.balance=b.balance;
	}
	
	
	
	void display() {
		System.out.println("original Constructor");
		System.out.println("Account No : "+accountNo);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Balance : "+balance);
	}
	
}
	
public class Bank1{

	public static void main(String[] args) {
		
		BankTest original = new BankTest(3200145,"siva",30000.00);
		System.out.println("Original Data");
		original.display();
		
		BankTest copied = new BankTest(original);
		System.out.println("Copied Data");
		copied.accountHolderName="Sai";
		
		copied.display();
		
	}

}
