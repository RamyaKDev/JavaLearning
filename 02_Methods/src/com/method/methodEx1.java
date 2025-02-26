package com.method;

public class methodEx1 {
	//without arg without return type
	//without arg with return type
	//with arg without return type
	//with arg with return type
	
	int a=10;
	//static void k1() {
		
	//}
	
void m1() {//instance method
System.out.println("without arg without return type");
	
}
int m2() {//instance method
	System.out.println("without arg with return type");
	
	
	//return a;
	return 500;
}
void m3(int c,String m) {//instance method
	System.out.println("with arg without return type: "+c+" "+m);
}

int m4(int a, int b) {//instance method
	System.out.println("with arg with return type: "+a+" "+b);
	int y=a+b;
	return y;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodEx1 ex1=new methodEx1();
		//without arg without return type
		ex1.m1();
		
		//without arg with return type
		int b=ex1.m2();
		System.out.println("without arg with return type in main:"+b);
		
		//with arg without return type
		ex1.m3(30,"Java");
		
		//with arg with return type
		int x=ex1.m4(100,200);
		System.out.println("with arg with return type in main:"+x);
	}

}
