package com.Inheritance;
class Inheritance116{
	static {
		System.out.println("Static block -Parent ");
	}
	static {
		System.out.println("Static block -Parent 1 ");
	}
	public Inheritance116() {
		System.out.println("Parent 0 arg constructor");
	}
}

public class Inheritance16 extends Inheritance116 {
	static {
		System.out.println("Static block -child");
	}
	static {
		System.out.println("Static block -child 1");
	}
	public Inheritance16() {
		System.out.println("child 0 arg constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		Inheritance16 i1=new Inheritance16();
	}

}
