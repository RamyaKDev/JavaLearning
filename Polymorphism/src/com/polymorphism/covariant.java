package com.polymorphism;
class A1{
	A1 m() {
		return this;
		
	}
	
}
public class covariant extends A1{
	covariant m() {
		return this;
		
	}
	void new1() {
		System.out.println("Covariant");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		covariant c1=new covariant();
		c1.m().new1();
	}

}
