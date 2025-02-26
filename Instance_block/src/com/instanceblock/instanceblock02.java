package com.instanceblock;

public class instanceblock02 {
	{
		System.out.println("Instanceblock");
	}
	
	public instanceblock02(){
		this(10);
		System.out.println("Constructor");
	}
	public instanceblock02(int a){
		this(10,20);
		System.out.println("1 arg Constructor:"+a);
	}
	public instanceblock02(int a,int b){
		System.out.println("2 arg Constructor:"+a+" "+b );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new instanceblock02();
	}

}
