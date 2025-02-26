package com.Collection;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	Employee(int id,String name ){
		this.id=id;
		this.name=name;
	}
	
	
}
public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(10,"AAA");
		Employee e11=new Employee(20,"BBB");
		
		//Heteregenous
		ArrayList a=new ArrayList();
		a.add(e);
		a.add(100);
		a.add("Hello");
		System.out.println(a);
		for(Object obj :a) {
			if(obj instanceof Employee) {
				Employee e1=(Employee) obj;
				System.out.println(e1.id+" "+e1.name);
			}
				if(obj instanceof Integer) {
					
					System.out.println(obj);
			
		}
				if(obj instanceof String) {
					
					System.out.println(obj);
			
		}
	}
		//Generic collection
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e);
		a1.add(e11);
		System.out.println(a1);
		
		Employee e7=a1.get(1);
		System.out.println("Get method "+e7.id+" "+e7.name);
			for(Employee emp: a1){
				System.out.println(emp.id+" "+emp.name);
			}
		
	}}
