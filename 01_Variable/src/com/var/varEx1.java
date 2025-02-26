package com.var;

public class varEx1 {
	int b=30;
	static int c=40;
	float t;
	boolean m;
void m1() {
	// static int b=5;
		int a=10;
		varEx1 ex1=new varEx1();
	System.out.println("local var:"+a);
	System.out.println("instance var:"+ex1.b);
	System.out.println("static var-direct access:"+c);
	System.out.println("static var-object access:"+ex1.c);
	System.out.println("static var-class access:"+varEx1.c);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");
		varEx1 ex1=new varEx1();
	final int a=20;
		System.out.println("local var:"+a);
		//a=60;
		System.out.println("instance  var int:"+ex1.b);
		System.out.println("instance  var float:"+ex1.t);
		System.out.println("instance  var boolean:"+ex1.m);
		System.out.println("static var-direct access:"+c);
		System.out.println("static var-object access:"+ex1.c);
		System.out.println("static var-class access:"+varEx1.c);
		ex1.m1();

	}

}
