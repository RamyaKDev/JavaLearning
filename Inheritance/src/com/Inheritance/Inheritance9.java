package com.Inheritance;

class Inheritance91{
	public Inheritance91(int a){
		System.out.println("Parent 1 arg constructor");	
	}
}
public class Inheritance9 extends Inheritance91{
	public Inheritance9(){
		super(50);
		System.out.println("Child default constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance9 i3=new Inheritance9();
	}

}
