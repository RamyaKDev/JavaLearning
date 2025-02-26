package com.assignments;

public class Kid extends Mother{
	String name = "Suman";
	public void work() {
		super.work();
		 System.out.println("Kid name:"+name);
		 System.out.println("Mother name:"+super.name);
		System.out.println("Teacher");
	}
	public void study() {
		this.work();
		System.out.println("Studying for Govt. Exam");
	}
	public static void main(String[] args) {
		Kid kid=new Kid();
		kid.study();
		
	}
}



