package com.java.training.functionalInterface;

public class LambdaDemo {
	public static void main(String args[]) {
		//for square
		Shape square=a->a*a;
		System.out.println(square.area(5));
		
		//for rectangle
		Shape rect=a->a*3;
		System.out.println(rect.area(5));
		
		//even we can use same reference
		square=a->a*a*a;
		System.out.println(square.area(4));
	}
}
