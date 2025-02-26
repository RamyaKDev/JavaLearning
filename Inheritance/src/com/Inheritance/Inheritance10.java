package com.Inheritance;
class Inheritance101{
	//compiler implicitly creates default constructor and calls parent class constructor
}
public class Inheritance10 extends Inheritance101{
	public Inheritance10(){
		super();
		System.out.println("Child default constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
