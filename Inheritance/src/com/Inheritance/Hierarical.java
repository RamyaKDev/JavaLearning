package com.Inheritance;
class HybridParent{
	void parent() {
		System.out.println("Parent");
	}
}
class Hybridchild1 extends HybridParent{
void child1() {
	System.out.println("child1");
	}
}
class Hybridchild2 extends HybridParent{
void child2() {
	System.out.println("child2");
	}
}
class Hybridchild3 extends HybridParent{
void child3() {
	System.out.println("child3");
	}
}
public class Hierarical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hybridchild3 c3= new Hybridchild3();
		c3.child3();
		c3.parent();
		Hybridchild2 c2= new Hybridchild2();
		c2.child2();
		c2.parent();
		Hybridchild1 c1= new Hybridchild1();
		c1.child1();
		c1.parent();
	}

}
