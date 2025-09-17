package com.java.training.defaultinterface;

public interface Calculator {
	void add(int x, int y);

	void product(int x, int y);
	
	default void square(int x) {
		System.out.println("Interface Square :"+ Math.pow(x,2));
	}
	
	//can't override, use static keyword
	static void call() {
		System.out.println("arithmetic operations");
	
	}
}
