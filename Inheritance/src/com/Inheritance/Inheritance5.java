package com.Inheritance;
class Inheritance51{
	public Inheritance51(){
		System.out.println("Super class constructor");
	}
}
public class Inheritance5 extends Inheritance51 {
	public Inheritance5() {
		//super() or this()
		System.out.println("Sub class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance5 i1=new Inheritance5();
		
	}

}
