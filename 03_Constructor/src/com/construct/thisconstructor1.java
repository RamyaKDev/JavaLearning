package com.construct;

public class thisconstructor1 {
	
	thisconstructor1(){
		this(10);
		System.out.println("0 arg constructor");
	}
	thisconstructor1(int a){
		this(10,20);
		System.out.println("1 arg constructor:"+a);
	}
	thisconstructor1(int a,int b){
		System.out.println("2 arg constructor:"+a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new thisconstructor1();
	}

}
