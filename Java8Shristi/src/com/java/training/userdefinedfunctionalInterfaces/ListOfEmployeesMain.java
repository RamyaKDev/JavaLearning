package com.java.training.userdefinedfunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
public class ListOfEmployeesMain {

	public static void main(String[] args) {
		List<Employee> employeeList= Arrays.asList(
				new Employee("Adhithi",5000,11,"Chennai"),
				new Employee("Pranav",5500,12,"Delhi"),
				new Employee("Arav",15000,13,"Chennai"),
				new Employee("Sachin",3000,14,"Bangalore"),
				new Employee("David",2050,15,"Bangalore")
				);
		
		System.out.println("Using Consumer");
		Consumer<List<Employee>> con=(emp)->
		{
			for(Employee e:employeeList) {
				//System.out.println(e.getEmpName().toUpperCase());
				System.out.println(e);
			}
		};
		con.accept(employeeList);
		
		System.out.println();
		System.out.println( " Using BiConsumer");
		BiConsumer<List<Employee>,String> empCon=(emplist,city)->{
			for(Employee employee: employeeList) {
				if(employee.getCity().equals(city))
					System.out.println(employee.getEmpName().toUpperCase());
			}
		};
		empCon.accept(employeeList, "Delhi");
		
		System.out.println();
		System.out.println( " Using Function");
		Function<List<Employee>,List<Employee>> empFun1=(emplist)->{
			List<Employee> employeesByCity=new ArrayList<>(); 
			for(Employee employee: employeeList) {
				if(employee.getCity().equals("Bangalore"))
					employeesByCity.add(employee);
			}
			return employeesByCity;
		};
		System.out.println(empFun1.apply(employeeList));
		
		
		System.out.println();
		System.out.println( " Using BiFunction");
		BiFunction<List<Employee>,String,List<String>> empFun=(emplist,city)->{
			List<String> employeeNames=new ArrayList<>(); 
			for(Employee employee: employeeList) {
				if(employee.getCity().equals(city))
					employeeNames.add(employee.getEmpName().toUpperCase());
			}
			return employeeNames;
		};
		System.out.println(empFun.apply(employeeList, "Chennai"));
		
		

		System.out.println();
		System.out.println( " Using Supplier");
		Supplier<List<Employee>> sup=()->employeeList;
		System.out.println(sup.get());
		

		System.out.println();
		System.out.println( " Using BiPredicate");
		BiPredicate<List<Employee>,Double> predEmp=(empList,salary)->{
			
			for(Employee employee:employeeList) {
				if(employee.getSalary()>=salary)
					System.out.println("Your salary is above 5000 "+employee.getEmpName());					
			}
			return true;
		};
		predEmp.test(employeeList, 5000.0);
	}

}
