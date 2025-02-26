package com.construct;

public class default_construct {
void m1() {
	System.out.println("Instance m1 method");
}
default_construct(){
	System.out.println("I am a default constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		default_construct c1=new default_construct();
		c1.m1();
	}

}
