package com.assignments;

public class SQLTrainer extends Trainer {

	public SQLTrainer(String dept, String institute) {
		super(dept, institute);
		
	}
	public SQLTrainer() {
		System.out.println("super dept :"+super.dept);
		System.out.println("super Institue :"+super.institute);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQLTrainer ram1=new SQLTrainer();
SQLTrainer ram=new SQLTrainer("SQL","Payilagam");
ram.training();
int salary=ram.getSalary();
System.out.println("salary :"+salary);


	}

}
