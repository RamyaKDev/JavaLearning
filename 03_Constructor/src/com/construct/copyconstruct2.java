package com.construct;
//copy constructor without constructor
public class copyconstruct2 {
	int age;
	String name;
	String address;
	public copyconstruct2(int age,String name,String address) {
		this.age=age;
		this.name=name;
		this.address=address;
		
	}
	public copyconstruct2() {
		
	}
	
	void display() {
		System.out.println(" method "+age+" "+name+" "+address);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyconstruct2 c1=new copyconstruct2(10,"aaa","bbb");
		copyconstruct2 c2=new copyconstruct2();
		c2.age=c1.age;
		c2.name=c1.name;
		c2.address=c1.address;
		c1.display();
		c2.display();
		
		
	}
	}


