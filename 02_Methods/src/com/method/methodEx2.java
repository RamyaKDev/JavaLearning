package com.method;

public class methodEx2 {
	int a=10;//instance var
	int z=50;//instance var
	static int c=30;
	
void m1(int x) {//x-local var
	int a=20;//local var
	methodEx2 ex2=new methodEx2();
	System.out.println("Local var: "+a);
	System.out.println("Local var: "+x);
	System.out.println("Instance var: "+this.a);// this keyword allowed in instance method when ins.var and loc.var are same
	System.out.println("Instance var: "+z);
	System.out.println("Static var direct access: "+c);
	System.out.println("Static var obj access: "+ex2.c);
	System.out.println("Static var class access: "+methodEx2.c);
}
static void m2(int a) {//a-local var
	methodEx2 ex3=new methodEx2();
	System.out.println("Local var: "+a);
	//System.out.println("Instance var: "+this.a); this keyword not allowed in static method when ins.var and loc.var are same
	System.out.println("Instance var same loc and instance name: "+ex3.a);
	System.out.println("Instance var in static method: "+ex3.z);
	System.out.println("Static var in static method: "+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodEx2 ex2=new methodEx2();
		ex2.m1(50);
		//m2(60);
		//ex2.m2(60);
		methodEx2.m2(60);
	}

}
