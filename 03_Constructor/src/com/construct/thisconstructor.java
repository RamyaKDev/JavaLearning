package com.construct;

public class thisconstructor {
	int age;
	String name;
	String address;
	
	public thisconstructor(int sage,String sname,String saddress) {
		age=sage;
		name=sname;
		address=saddress;
		System.out.println("1st "+age+" "+name+" "+address);
	}
	public thisconstructor(int age,String name) {
		this(age,name,"ccc");
		System.out.println("2nd "+age+" "+name+" "+address);
	}
	void display() {
		System.out.println(" method "+age+" "+name+" "+address);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisconstructor c1=new thisconstructor(50,"aaa","bbb");
		thisconstructor c2=new thisconstructor(100,"eee");
		c1.display();
		c2.display();
	}

}
