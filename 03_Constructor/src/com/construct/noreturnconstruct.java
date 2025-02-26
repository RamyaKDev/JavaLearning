package com.construct;

public class noreturnconstruct {
	int i=10;
	noreturnconstruct(){
		System.out.println("constructor");
		 return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noreturnconstruct n1=new noreturnconstruct();
		System.out.println("main"+n1.i);;
	}

}
