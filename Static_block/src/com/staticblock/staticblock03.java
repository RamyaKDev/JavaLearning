package com.staticblock;

public class staticblock03 {
	
	int a=10;
	static int b=20;
	static {
		int c=30;
		System.out.println("Local variable:"+c);
		System.out.println("Static variable:"+b);
		System.out.println("Static variable:"+staticblock03.b);
		staticblock03 s1=new staticblock03();
		System.out.println("Static variable:"+s1.b);
		System.out.println("Instance  variable:"+s1.a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
	}

}
