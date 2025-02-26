package com.construct;

public class Initializeconstruct {
	
int id;
String name;
float salary;

	public Initializeconstruct() {
		id=100;
		name="Ram";
		salary=10000f;
		
		id=101;
		name="Ramya";
		salary=20000f;
		//overrides the second value
	}
	void display() {
		System.out.println("id "+id+" "+"name: "+name+" "+"salary :"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initializeconstruct c1=new Initializeconstruct();
		c1.display();
	}

}
