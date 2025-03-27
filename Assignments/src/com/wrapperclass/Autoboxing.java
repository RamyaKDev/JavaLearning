package com.wrapperclass;

public class Autoboxing {
//converting primitive datatype to corresponding wrapper class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i=Integer.valueOf(a);// converting explicitly
		Integer j=a;//calling function implicitly
		System.out.println(i+" "+j);
		
		
	}

}
