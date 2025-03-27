package com.wrapperclass;

public class Unboxing {
//converting wrapper class to primitive data type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i=new Integer(3);
int a=i.intValue();//converting explicitly
int b=i;//converting implicitly 
System.out.println(a+" "+b);
	}

}
