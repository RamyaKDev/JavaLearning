package com.Inheritance;

class Inheritparent31{
	int i=10;
	void parent() {
		System.out.println("Parent i="+i);
	}
}



public class Inheritance3 extends Inheritparent31{
 int j=20;
 void child() {
		System.out.println("Child j="+j);
		System.out.println("Parent i="+i);
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance3 i3=new Inheritance3();
		i3.child();
		i3.parent();
	}

}
