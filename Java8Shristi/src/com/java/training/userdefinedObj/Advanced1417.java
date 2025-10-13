package com.java.training.userdefinedObj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Advanced1417 {

	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("Pranav",12,50980,"HR","Chennai"),
				new Employee("Adhithishri",16,80980,"Scientist","Chennai"),
				new Employee("Aarav",13,30980,"Testing","Bangalore"),
				new Employee("Arthi",14,10980,"Sales","Delhi"),
				new Employee("Chetan",11,5080,"Testing","Chennai"),
				new Employee("Chikoo",17,8980,"HR","Bangalore"),
				new Employee("Rana",18,7980,"HR","Delhi"));
		
		//Advanced
		//14.Group all employees by department
		System.out.println("Group all employees by department");
//		employees.stream()
//		.filter(emp->emp.getDept().equals("HR"))//this is filtering emp by dept
//		.forEach(System.out::println);
		
		employees.stream()
		.collect(Collectors.groupingBy(Employee::getDept))
		.forEach((key,value)->System.out.println(key+" "+value));
		
		
		//15.Get the count of employees by department 
		System.out.println();
		System.out.println("15.Get the count of employees by department ");
		employees.stream()
		.collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))		
		.forEach((key,value)->System.out.println(key+" "+value));
		
		//16.Get the sum of salaries of all employees by department 
		System.out.println();
		System.out.println("16.Get the sum of salaries of all employees by department  ");
		employees.stream()
		.collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)))
		.forEach((key,value)->System.out.println(key+" "+value));
		
		
		//17.Get the average salaries of all employees per department 
		System.out.println();
		System.out.println("17.Get the average salaries of all employees per department  ");
		employees.stream()
		.collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)))
		.forEach((key,value)->System.out.println(key+" "+value));
	}

}
