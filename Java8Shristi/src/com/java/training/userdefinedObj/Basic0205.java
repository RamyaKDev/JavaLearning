package com.java.training.userdefinedObj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Basic0205 {

	public static void main(String[] args) {
		//2. Find all employees where salary is greater than a particular value
		List<Employee> employees=Arrays.asList(
				new Employee("Pranav",12,50980,"HR","Chennai"),
				new Employee("Adhithi",16,80980,"Scientist","Chennai"),
				new Employee("Aarav",13,30980,"Testing","Bangalore"),
				new Employee("Arthi",14,10980,"Sales","Delhi"),
				new Employee("Chetan",11,5080,"Testing","Chennai"),
				new Employee("Chikoo",17,8980,"HR","Bangalore"),
				new Employee("Rana",18,7980,"HR","Delhi"));
		
		employees.stream()
		.filter(emp->emp.getSalary()>50000)
		.forEach(e->System.out.println(e));
		
		System.out.println();
		//3. Print all the employee names only in upper case and alphabetical order
		employees.stream()
		.map(emp->emp.getEmpName().toUpperCase())
		.sorted()
		.forEach(e->System.out.println(e));
		
		System.out.println();
		//4. Get the first employee where dept is "HR" and if not available throw exception
	Employee e=	employees.stream()
			.filter(emp->emp.getDept().equals("HR"))
		//.filter(emp->emp.getDept().equals("HRO"))
		.findFirst()
		.orElseThrow(()->new RuntimeException("Employee not found"));
		
	System.out.println(e);
	
	System.out.println();
	//5. Get the total salary of all employees in a specific department
	Double totalSalary=	employees.stream()
			.filter(emp->emp.getDept().equals("Testing"))
			.collect(Collectors.summingDouble(emp->emp.getSalary()));
	
	System.out.println(totalSalary);
	}

}
