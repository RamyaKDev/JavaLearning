package com.assignments;

public class EB_Reading {
int consumed_units=250;
	public int reading() {
		
		return consumed_units;
	}
	public void calculate(int units) {
		int payment;
		if(units<100) {
			payment=units*2;
			
		}
		else if((units>=100)&&(units<=200)) {
			System.out.println("else if "+ units);
			int temp=(units-100)*5;
			System.out.println("else if "+ temp);
			payment=temp+(100*2);
		}
		else {
			System.out.println("else  "+ units);
		payment=(((units-200)*9)+((units-100)*5)+(100*2));
		}
		
		System.out.println("amount need to be pay "+payment);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EB_Reading assessor=new EB_Reading();
		int consumed_units=assessor.reading();
		assessor.calculate(consumed_units);
	}

}
