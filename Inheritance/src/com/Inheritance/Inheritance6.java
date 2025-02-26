package com.Inheritance;
class Inheritance61 {
	public Inheritance61(){
		System.out.println("Super class constructor");
	}
}
public class Inheritance6 extends Inheritance61 {
	public Inheritance6(){
		
		super();
		Inheritance6 i1=new Inheritance6(10);
		
		System.out.println("Sub class 0 arg constructor");
	}
	public Inheritance6(int a){
		//super() compiler creates internally
		System.out.println("1 arg class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance6 i1=new Inheritance6();
		//Inheritance6 i2=new Inheritance6(10);
		
	}

}
