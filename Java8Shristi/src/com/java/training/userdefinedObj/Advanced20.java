package com.java.training.userdefinedObj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Advanced20 {

	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("Pranav",12,50980,"HR","Chennai"),
				new Employee("Adhithishri",16,80980,"Scientist","Chennai"),
				new Employee("Aarav",13,30980,"Testing","Bangalore"),
				new Employee("Arthi",14,10980,"Sales","Delhi"),
				new Employee("Chetan",11,5080,"Testing","Chennai"),
				new Employee("Chikoo",17,8980,"HR","Bangalore"),
				new Employee("Rana",18,7980,"HR","Delhi"));
		
		//20.Find the department with the highest average salary 
		Map <String, Double> mapemp=employees.stream()
		.collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
		
		String key=mapemp.keySet().stream()
		.max(Comparator.comparingDouble(dept->mapemp.get(dept)))
		.get();
		
		double highestAvg=mapemp.get(key);
		System.out.println(highestAvg);
	}

}
