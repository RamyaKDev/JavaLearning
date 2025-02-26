package com.abstraction;
 interface interface1{
	public abstract void run();
	
	default void change() {
		p();
		System.out.println("default method ");
	}
	
	private void p() {
		System.out.println("private method ");
	}
	static void m2() {
		
		System.out.println("static method ");
	}
	int a=10;
}
 interface interface2{
	 interface interface4{
		 public abstract void m1();
	 }
	 public abstract void run();
	
	 int a=50;
 }
 interface interface3 extends interface2{
	 
	 public abstract void m();
 }
 class iterfaceclass implements interface1,interface2.interface4,interface3{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int b= interface2.a+10;
		System.out.println("Running "+b);
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("m method ");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method -nested interface");
	}
	
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterfaceclass i1=new iterfaceclass();
		i1.run();
		i1.m();
		i1.m1();
		i1.change();
		interface1.m2();
		System.out.println("a:"+(interface1.a+1));
	}

}
