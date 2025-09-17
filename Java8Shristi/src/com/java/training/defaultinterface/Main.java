package com.java.training.defaultinterface;

public class Main {

	public static void main(String[] args) {
		 Calculator  calculator=new BasicCalculator();
		 calculator.add(5, 4);
		 calculator.product(5, 4);
		 calculator.square(3);
		 
		 //call static method using interface name
		 Calculator.call();
	}

}
