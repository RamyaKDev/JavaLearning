package com.features;

@FunctionalInterface
interface testinterface1{
	void run();
	
	static void add() {
		System.out.println("Static 1");
	}
	static void add1() {
		System.out.println("Static 2");
	}
	default void sub() {
		System.out.println("sub 1");
	}
	default void sub1() {
		System.out.println("sub 2");
	}
}

public class lamb1 {

	public static void main(String[] args) {
		
		testinterface1 t=()->System.out.println("Lambda method");	
		t.run();
		t.sub();
		t.sub1();
		testinterface1.add();
		testinterface1.add1();
	}

}
