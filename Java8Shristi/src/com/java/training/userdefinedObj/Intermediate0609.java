package com.java.training.userdefinedObj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Intermediate0609 {

	public static void main(String[] args) {
		
		List<Employee> employees=Arrays.asList(
				new Employee("Pranav",12,50980,"HR","Chennai"),
				new Employee("Adhithi",16,80980,"Scientist","Chennai"),
				new Employee("Aarav",13,30980,"Testing","Bangalore"),
				new Employee("Arthi",14,10980,"Sales","Delhi"),
				new Employee("Chetan",11,5080,"Testing","Chennai"),
				new Employee("Chikoo",17,8980,"HR","Bangalore"),
				new Employee("Rana",18,7980,"HR","Delhi"));
		
		
		//6. Check if all employees have a salary greater than a specific Value
		boolean match= employees.stream()
		//.allMatch(emp->emp.getSalary()>50000);
		.anyMatch(emp->emp.getSalary()>50000);
		System.out.println(match);
		
		System.out.println();
		System.out.println("Total Salary and Average");
		//7. Get the sum of salaries of all employees and the average salary
		
		//1st way
		double totalSalary=employees.stream()
		//.collect(Collectors.summarizingDouble(emp->emp.getSalary()));
		.mapToDouble(emp->emp.getSalary())
		.sum();
		
		System.out.println(totalSalary);
		
		//2nd way
		totalSalary=employees.stream()
		.collect(Collectors.summarizingDouble(emp->emp.getSalary()))
		.getSum();
		System.out.println(totalSalary);
		
		System.out.println();
		//Average
		OptionalDouble avg=employees.stream()
		.mapToDouble(emp->emp.getSalary())
		.average();
		
		avg.ifPresent(System.out::println);
		
		double avr=employees.stream()
		.collect(Collectors.averagingDouble(emp->emp.getSalary()));
		System.out.println(avr);
		
		System.out.println();
		System.out.println("Print employee details in Map format");
		//8.Get a Map of Employee Names and their salaries 
		Map <String, Double> mapEmp=employees.stream()
		.collect(Collectors.toMap(emp->((Employee) emp).getEmpName().toUpperCase(), emp->emp.getSalary()));
		mapEmp.forEach((name,salary)->System.out.println(name+" "+salary));
		
		System.out.println();
		System.out.println("Print employee details from highest to lowest salary");
		//9. Print the employee details from highest to lowest salary
		employees.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.forEach(System.out::println);
		
		employees.stream()
		.sorted((e1,e2)->((Double)e2.getSalary()).compareTo(e1.getSalary()))
		.forEach(System.out::println);
		
	}

}
