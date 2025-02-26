package com.Inheritance;
//WITH INHERITANCE
class Inheritance21{
	void m1() {
		System.out.println("grand Parent m1 method");
		
	}
	void m2() {
		System.out.println("grand Parent m2 method");
	}
}
class Inheritance22 extends Inheritance21{
	
	
	void m3() {
		System.out.println("Parent m3 method");
	}
}
class Inheritance23 extends Inheritance22{
	
	void m4() {
		System.out.println("Child m4 method");
		
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance23 i2= new Inheritance23();
		i2.m1();
		i2.m2();
		i2.m3();
		i2.m4();
		
	}

}
