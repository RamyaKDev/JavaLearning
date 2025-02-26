package com.polymorphism;

public class methodoverloading {
	public void m1() {
	System.out.println("no org method");
}
	
public int m1(int a) {
	System.out.println("a :"+a);
	return a;
}

int m1(int a,int b,int c,int d) {
	System.out.println("return type different");
	return a;
}
void m1(int a,int b) {
	System.out.println("a,b :"+a+" "+b);
}
void m1(int a, int b,int c) {
	System.out.println("a,b,c :"+a+" "+b+" "+c);
}
void m1(int a, int b,String c) {
	System.out.println("a,b,c String :"+a+" "+b+" "+c);
}

void m1(String c,int a, int b) {
	System.out.println("c,a,b  :"+c+" "+a+" "+b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading o1=new methodoverloading();
		o1.m1();
		o1.m1(10);
		o1.m1(10,20);
		o1.m1(10,20,30);
		o1.m1(10,20,"aaa");
		o1.m1("ppp",50,60);
		o1.m1(10);
		int a=o1.m1(50);
		
		System.out.println("main method: a :"+a);
		
	}

}
