package com.Inheritance;
class Inheritance114{
	public Inheritance114() {
		System.out.println("Parent constructor");
	}
	{
		System.out.println("Parent Instance block");
	}
}
public class Inheritance14 extends Inheritance114{
	public Inheritance14() {
		System.out.println("Child constructor");
	}
	{
		System.out.println("Child Instance block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Inheritance14();
		new Inheritance14();
		new Inheritance14();
	}

}
