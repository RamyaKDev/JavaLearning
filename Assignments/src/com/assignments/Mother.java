package com.assignments;

public class Mother extends Grandma{
	String name = "Arasi";
	 public void work() {
		 super.work();
		 System.out.println("Mother name:"+name);
		 System.out.println("Grandma name:"+super.name);
		 System.out.println("Police");
	 }
}