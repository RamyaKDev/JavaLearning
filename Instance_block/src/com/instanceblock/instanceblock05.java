package com.instanceblock;

public class instanceblock05 {
	instanceblock05(){
		System.out.println("Constructor");
	}
	int a=10;
	static int b=20;
	void m1() {
		System.out.println("Instance method");
	}
	static void m2() {
		System.out.println("static method");
	}
	{
		int c=30;
		System.out.println("instance block");
		
		System.out.println("Local var c:"+c);
		System.out.println("instance var a:"+a);
		System.out.println("static var b:"+b);
		m1();
		m2();
		instanceblock05.m2();
		//new instanceblock05().m2(); infinty loop bcoz again and again loops are executed
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new instanceblock05();
	}

}
