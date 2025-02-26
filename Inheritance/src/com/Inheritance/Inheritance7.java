package com.Inheritance;

class Inheritance74{
	public Inheritance74(){// extends base class - object class constructor
		super();
	System.out.println("Super class constructor");
	}
}
class Inheritance7 extends Inheritance74{
	public Inheritance7(){
		super();
		System.out.println("Sub class constructor1");
		}
	public Inheritance7(int a){
		super();
		System.out.println("1 arg constructor");
		}
	public Inheritance7(int a,int b){
		super();
		System.out.println("2 arg constructor");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance7 i1=new Inheritance7();
		Inheritance7 i2=new Inheritance7(10);
		Inheritance7 i3=new Inheritance7(10,20);
}
}