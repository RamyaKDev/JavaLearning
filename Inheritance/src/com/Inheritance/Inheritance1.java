package com.Inheritance;
//WITHOUT INHERITANCE
class Inheritance11{
	void m1() {
		System.out.println("Parent m1 method");
		
	}
	void m2() {
		System.out.println("Parent m2 method");
	}
}
class Inheritance12 {
	void m1() {
		System.out.println("Child m1 method");
		
	}
	void m2() {
		System.out.println("Child m2 method");
	}
	void m3() {
		System.out.println("Child m1 method");
		
	}
	void m4() {
		System.out.println("Child m2 method");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance11 i=new Inheritance11();
		i.m1();
		i.m2();
		Inheritance12 i1=new Inheritance12();
		i1.m1();
		i1.m2();
		i1.m3();
		i1.m4();
		
	}

}
