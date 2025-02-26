package com.Inheritance;
class Inheritance84{
public Inheritance84(){
	
System.out.println("Super class constructor");
}
}

public class Inheritance8 extends Inheritance84{
	public Inheritance8(){
		this(50);
		System.out.println("Sub class constructor1");
		}
	public Inheritance8(int a){
		this(500,1000);
		System.out.println("1 arg constructor "+a);
		}
	public Inheritance8(int a,int b){
		//super();
		System.out.println("2 arg constructor "+ a+" "+b);
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance8 i1=new Inheritance8();
	}

}
