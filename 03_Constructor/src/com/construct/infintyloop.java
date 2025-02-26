package com.construct;

public class infintyloop {
	int a=10;
	static int b=20;
	public infintyloop() {
		this(50);
		int c=30;
		//infintyloop i1=new infintyloop();
		System.out.println("Local Variable "+c);
		System.out.println(" Instance Variable "+a);
		
		System.out.println("Static variable "+b);
	//	System.out.println("Static variable "+i1.b);
		System.out.println("Static variable "+infintyloop.b);
		
		m1();
		method1();
		
	}
	void m1() {
		System.out.println("Instance method");
	}
	static void method1() {
		System.out.println("Static method");
	}
	public infintyloop(int a) {
		System.out.println("1 arg constructor:a "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		infintyloop i1=new infintyloop();
		//infintyloop i2=new infintyloop(50);
	}

}
