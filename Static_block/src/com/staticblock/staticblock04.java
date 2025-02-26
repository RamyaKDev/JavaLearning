package com.staticblock;

public class staticblock04 {
	static int id;
	static String name;
	{
		System.out.println("Instance block");
	}
	public staticblock04() {
		System.out.println("Constructor");
	}
	static void display() {
		System.out.println("Static block"+ id+" "+name);
	}
	void m1() {
		System.out.println("Instance method");
	}
	static {
		System.out.println("Static block");
		id=101;
		name="aaa";
		display();
		staticblock04.display();
		staticblock04 s1=new staticblock04();
		s1.m1();
		s1.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		staticblock04 s1=new staticblock04();
	}

}
