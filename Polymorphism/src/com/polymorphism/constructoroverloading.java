package com.polymorphism;

public class constructoroverloading {
	public constructoroverloading(){
		System.out.println("no org constructor");
	}
public constructoroverloading(int a){
	System.out.println("a :"+a);
	}
public constructoroverloading(int a,int b){
	System.out.println("a,b :"+a+" "+b);
}
public constructoroverloading(int a, String b){
	System.out.println("a,b :"+a+" "+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructoroverloading c1=new constructoroverloading();
		constructoroverloading c2= new constructoroverloading(10);
		new constructoroverloading(10,20);
		new constructoroverloading(10,"aaa");
	}

}
