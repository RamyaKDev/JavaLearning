package com.java.training.functionalInterface;

public class AnonyDemo {
	public static void main(String args[]) {
	//interface reference =implementation class
	Greet greet=new User();
	greet.welcomeUser("Ramya");
	
	//using anonymous innerclass providing implementation for functional interface
	Greet agreet=new Greet() {

		@Override
		public void welcomeUser(String name) {
			System.out.println("Welcome "+name);
			
		}
		
	};
	agreet.welcomeUser("Adhithi");
	
	//using anonymous innerclass implementation for interface
	Calculator calc=new Calculator() {

		@Override
		public void normalCalc() {
			System.out.println("normal");
			
		}

		@Override
		public void electricCalc() {
			System.out.println("electronic");
			
		}
		
	};
	calc.electricCalc();
	calc.normalCalc();
}
	
}