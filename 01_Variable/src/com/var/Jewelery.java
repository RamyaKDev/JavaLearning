package com.var;

public class Jewelery {
	 static int goldPrice = 7100; 
	    static int silverPrice = 150; 
	    int making_charges, wastage; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jewelery jew1=new Jewelery();
Jewelery jew2=new Jewelery();
jew1.making_charges=5;
jew1.wastage=1;
jew2.making_charges=51;
jew2.wastage=15;
jew1.bill();
jew2.bill();
System.out.println(Jewelery.goldPrice+" "+Jewelery.silverPrice);
	}
	public void bill() {
		System.out.println(making_charges+" "+wastage);
	}

}
