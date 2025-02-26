package com.construct;

public class paramconstruct {
	paramconstruct(){
		System.out.println("0 -arg constructor");
	}
	paramconstruct(int a){
		System.out.println("1 -arg constructor: "+a);
		
	}
	paramconstruct(int a,int b){
		System.out.println("2 -arg constructor: "+a+" "+b);
	}
	paramconstruct(int a,int b,int c){
		System.out.println("3 -arg constructor: "+a+" "+b+" "+c);
	}
	void m1() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//named approach object creation
		
		/*paramconstruct p0=new paramconstruct();
		p0.m1();
		paramconstruct p1=new paramconstruct(10);
		p1.m1();
		paramconstruct p2=new paramconstruct(10,20);
		p2.m1();
		paramconstruct p3=new paramconstruct(10,20,30);
		p3.m1();*/
		// nameless approach object creation
		new paramconstruct().m1();
		new paramconstruct(100).m1();
		new paramconstruct(100,200).m1();
		new paramconstruct(100,200,300).m1();
	}

}
