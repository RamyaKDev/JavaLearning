package com.var;

public class varEx2 {
	int a=20;
	static int b=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varEx2 ex2=new varEx2();
		System.out.println("Instance var:"+ex2.a);
		System.out.println("Static var:"+ex2.b);
		ex2.a=30;
		ex2.b=40;
		System.out.println("Instance var:"+ex2.a);
		System.out.println("Static var:"+ex2.b);
		varEx2 ex3=new varEx2();
		ex3.a=50;
		ex3.b=60;
		System.out.println("Instance var:"+ex3.a);
		System.out.println("Static var:"+ex3.b);
		varEx2 ex4=new varEx2();
		System.out.println("New object Instance var:"+ex4.a);//allocates separate mmy for each obj creaction
		System.out.println("New object Static var:"+ex4.b);//shares same mmy for all objs
	}

}
