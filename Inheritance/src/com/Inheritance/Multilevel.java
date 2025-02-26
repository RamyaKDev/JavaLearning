package com.Inheritance;
class InheritanceParent1{
	void m1() {
		System.out.println("Parent");
	}
}
class Inheritancechild1 extends InheritanceParent1{
void m2() {
	System.out.println("Child");
	}
}
class grandchild extends Inheritancechild1{
void m3() {
	System.out.println("grand Child");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandchild g1=new grandchild();
		g1.m3();
		g1.m2();
		g1.m1();
		
	}

}
