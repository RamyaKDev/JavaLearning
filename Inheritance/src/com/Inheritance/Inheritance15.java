package com.Inheritance;
class Inheritance115 {
	{
		System.out.println("Parent Instance block");
	}
	public Inheritance115() {
		System.out.println("Parent 0 arg constructor");
	}
	public Inheritance115(int a) {
		System.out.println("Parent 1 arg constructor");
	}
	
}
public class Inheritance15 extends Inheritance115 {
	{
		System.out.println("Child Instance block");
	}
	public Inheritance15() {
		System.out.println("Child  0 arg constructor");
	}
	public Inheritance15(int a) {
		super(50);
		System.out.println("Child 1 arg constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Inheritance15();
new Inheritance15(10);
	}

}
