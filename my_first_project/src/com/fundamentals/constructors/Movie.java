package com.fundamentals.constructors;

public class Movie {
	String movieName;
	String hero;
	String heroein;
	long budget;
	
	Movie(){
		System.out.println("no arg constructor called");
	}
	
	Movie(String movieName){
		this();
		System.out.println("one arg constructor called ");
		this.movieName=movieName;
	}
	
	Movie(String movieName,String hero){
		this(movieName);
		System.out.println("two arg constructor called ");
		this.hero=hero;
	}
	
	Movie(String movieName,String hero,String heroein){
		this(movieName,hero);
		System.out.println("three arg constructor called ");
		this.heroein=heroein;
	}
	
	Movie(String movieName,String hero,String heroein,long budget){
		this(movieName,hero,heroein);
		System.out.println("four arg constructor called ");
		this.budget=budget;
	}
	

	public static void main(String[] args) {
		System.out.println("main method Started !!");
		
		Movie m = new Movie("OG","Pavan Kalyan","Priyanka Mohan",1000000000);
		m.display();
	}
	
	void display() {
		System.out.println("Movie Name : "+movieName);
		System.out.println("Hero : "+hero);
		System.out.println("Heroein :"+heroein);
		System.out.println("Budget : "+budget);
	}

}
