package com.construct;

public class assignmentconstruct2 {
	public assignmentconstruct2() {
		System.out.println("Constructor");
		
		m1();
		m2();
	}
	void m1() {
		System.out.println("Instance method");
	}
	static void m2() {
		System.out.println("static method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignmentconstruct2 a1= new assignmentconstruct2(); 
	}

}
