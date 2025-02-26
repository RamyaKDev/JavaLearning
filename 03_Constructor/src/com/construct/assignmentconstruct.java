package com.construct;

public class assignmentconstruct {
	int a=10;
	static int b=20;
	public assignmentconstruct() {
		int c=30;
		System.out.println("Inside constructor");
		System.out.println("Local Variable "+c+" Instance Variable "+a+" "+"Static variable "+b);
	}
	void instance_method() {
		int c=300;
		System.out.println("Instance method");
		System.out.println("Local Variable "+c+" Instance Variable "+ a +" "+"Static variable "+b);
	}
	static void method1() {
		int c=3000;
		assignmentconstruct a1=new assignmentconstruct();
		System.out.println("Static method");
		System.out.println("Local Variable "+c+" Instance Variable "+ a1.a +" "+"Static variable "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignmentconstruct a1=new assignmentconstruct();
		a1.instance_method();
		assignmentconstruct.method1();
	}

}
