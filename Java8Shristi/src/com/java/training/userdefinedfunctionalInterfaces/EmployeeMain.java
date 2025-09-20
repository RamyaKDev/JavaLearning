package com.java.training.userdefinedfunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee=new Employee("Pranav",5000,15,"Chennai");
		
		System.out.println("Using Consumer");
		Consumer<Employee> con=emp->System.out.println(emp.getEmpName()); 
		con.accept(employee);
		
		System.out.println();
		System.out.println("Using Predicate");
		Predicate<Employee> empPred=emp->emp.getEmpId()>10;
		System.out.println(empPred.test(employee));
		
		System.out.println();
		System.out.println("Using BiPredicate");
		BiPredicate<Employee,Integer> empBiPred=(emp,num)->emp.getEmpId()>num;
		System.out.println(empBiPred.test(employee,16));
		
		System.out.println();
		BiPredicate<Employee,String> empBPred=(emp,str)->emp.getCity().equals(str);
		System.out.println(empBPred.test(employee,"Chennai"));
		
		System.out.println();
		System.out.println("Using Supplier");
		Supplier<Employee> sup=()->new Employee("Adi",5000,15,"Chennai");
		System.out.println(sup.get());
		
		System.out.println();
		System.out.println("Using Function");
		Function<Employee,String> fun=emp->emp.getEmpName();
		System.out.println(fun.apply(employee));
		
		System.out.println();
		System.out.println("Using BiFunction");
		BiFunction<Employee,String,String> Bifun=(emp,city)->{
			if(emp.getCity().equals(city))
					return "Hello "+emp.getEmpName();
			return "Sorry";
		};
		System.out.println(Bifun.apply(employee, "Chennai"));
	}
}
