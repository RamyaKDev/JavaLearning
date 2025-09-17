package com.java.training.defaultinterface;

public class BasicCalculator implements Calculator{

	@Override
	public void add(int x, int y) {
		System.out.println("Add "+(x+y));
		
	}

	@Override
	public void square(int x) {
		System.out.println(Math.pow(x,2));
		Calculator.super.square(5);
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product "+(x*y));
		
	}

}
