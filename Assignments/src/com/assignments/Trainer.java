package com.assignments;

public class Trainer {
	String dept="Java";
	String institute="Payilagam";
	private int salary=10000;
	
	public int getSalary() {
		return salary;
	}
	public Trainer(String dept,String institute){
		this.dept=dept;
		this.institute=institute;
	}
	
	public Trainer() {
		
	}
	public void training() {
		System.out.println("Online");
		System.out.println("dept "+this.dept+" institue "+this.institute);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trainer trainerKumar=new Trainer("CSE","Payilagam");
trainerKumar.training();

	}

}
