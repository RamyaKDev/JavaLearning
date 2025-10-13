package com.java.training.userdefinedObj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Advanced1819 {

	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("Pranav",12,50980,"HR","Chennai"),
				new Employee("Adhithishri",16,80980,"Scientist","Chennai"),
				new Employee("Aarav",13,30980,"Testing","Bangalore"),
				new Employee("Arthi",14,10980,"Sales","Delhi"),
				new Employee("Chetan",11,5080,"Testing","Chennai"),
				new Employee("Chikoo",17,8980,"HR","Bangalore"),
				new Employee("Rana",18,7980,"HR","Delhi"));
		
		//18.Check if all employees belong to a specific department 
	boolean e=	employees.stream()
			.anyMatch(emp->emp.getDept().equals("HR"));
		//.allMatch(emp->emp.getDept().equals("HR"));
		System.out.println(e);
		
		System.out.println();
		System.out.println("19.List all employees grouping by cities but belong to the same department");
		
		
		//19.List all employees grouping by cities but belong to the same department
		employees.stream()
		.collect(Collectors.groupingBy(Employee::getDept,Collectors.groupingBy(Employee::getCity)))
			.forEach((key,value)->System.out.println(key+" "+value));
		
		
	}

}
