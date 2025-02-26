package com.Inheritance; 

class InheritanceParent{
	void m1() {
		System.out.println("Parent");
	}
}
class Inheritancechild extends InheritanceParent{
void m2() {
	System.out.println("Child");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritancechild c1=new Inheritancechild();
		c1.m2();
		c1.m1();
	}

}
