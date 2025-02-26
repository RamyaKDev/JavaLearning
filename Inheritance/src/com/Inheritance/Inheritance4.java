package com.Inheritance;
class Inheritparent41{
	int i=10;//parent var
	void parent() {
		System.out.println("Parent i="+i);
		
	}
	void m1() {
		System.out.println("Parent method");
	}
}



class Inheritance4 extends Inheritparent41{
 int i=20;//child var
 void child(int i) {
	 System.out.println("Local i="+i);
		System.out.println("Child i="+this.i);
		System.out.println("Parent i="+super.i);
		
	}
 void m1() {
		System.out.println("child method");
	}
 void m2() {
	 this.m1();
	 super.m1();
 }
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance4 i4=new Inheritance4();
		i4.child(50);
		i4.parent();
		i4.m2();
		
	}
}

