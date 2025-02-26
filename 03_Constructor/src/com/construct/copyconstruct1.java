package com.construct;
//copy constructor with constructor
public class copyconstruct1 {
	int age;
	String name;
	String address;
	public copyconstruct1(int age,String name,String address) {
		this.age=age;
		this.name=name;
		this.address=address;
		
	}
	public copyconstruct1(copyconstruct1 c1) {
		age=c1.age;
		name=c1.name;
		address=c1.address;
	}
	void display() {
		System.out.println(" method "+age+" "+name+" "+address);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyconstruct1 c1=new copyconstruct1(10,"aaa","bbb");
		copyconstruct1 c2=new copyconstruct1(c1);
		c1.display();
		c2.display();
	}

}
