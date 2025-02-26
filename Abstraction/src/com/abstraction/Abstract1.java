package com.abstraction;
 abstract class Abstract12{
	Abstract12(){
		System.out.println("abstract constructor");
	}
	int d=10;
	abstract  void run();
	abstract  void run1();
	final void m1() {
		System.out.println("concrete method:"+ d);
	}
	static {
		System.out.println("static block");
	}
}
public abstract class Abstract1 extends Abstract12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Adhithishri Saravanan");
System.out.println("Pranavan Saravanan");
Abstract13 c1= new Abstract13();
c1.run();
c1.run1();
c1.m1();
	}


}
 class Abstract13 extends Abstract12{



	@Override
	void run1() {
		// TODO Auto-generated method stub
		System.out.println("abstract method run1 in subclass");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("abstract method run  2 in subclass");
	}
	
	
	}