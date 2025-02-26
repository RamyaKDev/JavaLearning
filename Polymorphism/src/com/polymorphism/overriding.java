package com.polymorphism;
class overriding1{
	void m1() {
		System.out.println("parent method");
	}
}
public class overriding extends overriding1 {
	void m1() {
		System.out.println("child method");
	}
	void m2() {
		System.out.println("child method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding1 r1=new overriding1();
		r1.m1();
		
		overriding r2=new overriding();
		r2.m1();
		r2.m2();
		
		overriding1 r3=new overriding();
		r3.m1();
		((overriding)r3).m2();
		
	}
}
