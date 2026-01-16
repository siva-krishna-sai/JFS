package com.fundamentals.constructors;

class Vehicle {
	
	String regitsrationNumber;
	String ownerName;
	
	Vehicle(String regitsrationNumber, String ownerName){
		this.regitsrationNumber=regitsrationNumber;
		this.ownerName=ownerName;
	}
	
	Vehicle(Vehicle v){
		this.regitsrationNumber=v.regitsrationNumber;
		this.ownerName=v.ownerName;
	}
	
}

class Car extends Vehicle{
	
	String model;
	double price;
	
	Car(String regitsrationNumber, String ownerName, String model,double price){
		super(regitsrationNumber,ownerName);
		this.model=model;
		this.price=price;
	}
	
	Car(Car v){
		super(v);
		this.model=v.model;
		this.price=v.price;
	}
	
	void display() {
		System.out.println("Registration Number : "+ regitsrationNumber);
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
		System.out.println("****************************************");
	}

	
}


public class Main {

	public static void main(String[] args) {
		Car original = new Car("DL01AB1234", "siva", "Toyota Corolla", 1500000.0);
        Car copied = new Car(original);

        System.out.println("Original Car Details:");
        original.display();

        System.out.println("Copied Car Details:");
        copied.display();
	}

}
