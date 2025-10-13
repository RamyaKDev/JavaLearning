package com.java.training.userdefinedObj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Intermediate1013 {

	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("Pranav",12,50980,"HR","Chennai"),
				new Employee("Adhithishri",16,80980,"Scientist","Chennai"),
				new Employee("Aarav",13,30980,"Testing","Bangalore"),
				new Employee("Arthi",14,10980,"Sales","Delhi"),
				new Employee("Chetan",11,5080,"Testing","Chennai"),
				new Employee("Chikoo",17,8980,"HR","Bangalore"),
				new Employee("Rana",18,7980,"HR","Delhi"));
		
		//10. Get the employees with the highest salary 
		//Get the Highest Salary
		double maxValue=employees.stream()
		.mapToDouble(emp->emp.getSalary())
		.max()
		.getAsDouble();
		
		
		//filter employee
		employees.stream()
		.filter(emp->emp.getSalary()==maxValue)
		.forEach(System.out::println);
		
		//11. Get the employees with the second highest salary
		Optional<Employee> e=employees.stream()
		.sorted(Comparator.comparing(Employee::getSalary).reversed())
		.skip(1)
		.findFirst();
		
		e.ifPresent(System.out::println);
		
		//12. Get the employees who are earning above the average salary
		//1.First find avg salary
		//2.then filter employees
		
	double avg=	employees.stream()
		.mapToDouble(emp->emp.getSalary())
		.average()
		.getAsDouble();
		System.out.println(avg);
		
	employees.stream()
	.filter(emp->emp.getSalary()>avg)
	.forEach(System.out::println);
	
	System.out.println("Longest name");
	
	//13. Get the employee with the longest name 
	//1st way
	Employee emp1=employees.stream()
	.max(Comparator.comparing(emp->emp.getEmpName().length()))
	.get();	
	
	System.out.println(emp1);
	
	//2nd way
	Optional <String> longname=employees.stream()
	.map(emp->emp.getEmpName())
	.sorted((e1,e2)->((Integer)e2.length()).compareTo(e1.length()))
	.findFirst();

	longname.ifPresent(System.out::println);
	
	}

}
