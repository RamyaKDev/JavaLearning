package com.staticblock;

public class staticblock02 {
	
	static int id;
	static String name;
	static {
		id=101;
		name="aaa";
		System.out.println("Static block");
	}
	static void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		new staticblock02().display();
		
	}

}
