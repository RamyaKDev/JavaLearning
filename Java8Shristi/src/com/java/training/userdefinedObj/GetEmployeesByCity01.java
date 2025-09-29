package com.java.training.userdefinedObj;

import java.util.Arrays;
import java.util.List;

public class GetEmployeesByCity01 {

	public static void main(String[] args) {
		//Basics 
		//1. Find all employees from a specific city and get the count
		
	List<Employee> employees=Arrays.asList(
			new Employee("Pranav",12,50980,"HR","Chennai"),
			new Employee("Adhithi",16,80980,"Scientist","Chennai"),
			new Employee("Aarav",13,30980,"Testing","Bangalore"),
			new Employee("Arthi",14,10980,"Sales","Delhi"),
			new Employee("Chetan",11,5080,"Testing","Chennai"),
			new Employee("Chikoo",17,8980,"HR","Bangalore"),
			new Employee("Rana",18,7980,"HR","Delhi"));
	
	employees.stream()
	.filter(emp->emp.getCity().equals("Chennai"))
	.forEach(e->System.out.println(e));
	
	long total=employees.stream()
	.filter(emp->emp.getCity().equals("Chennai"))
	.count();
	System.out.println(total);
	}

}
