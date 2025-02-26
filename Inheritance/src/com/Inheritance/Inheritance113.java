package com.Inheritance;
class Inheritance123{
	{
		System.out.println("Parent Instance block-1");
	}
	{
		System.out.println("Parent Instance block-2");
	}
	{
		System.out.println("Parent Instance block-3");
	}
}
public class Inheritance113 extends Inheritance123 {
	{
		System.out.println("Child Instance block-1");
	}
	{
		System.out.println("Child Instance block-2");
	}
	{
		System.out.println("Child Instance block-3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Inheritance113();
	}

}
