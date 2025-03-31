package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee e1=new Employee(10,"BBB");
 Employee e2=new Employee(40,"BBB");
 Employee e3=new Employee(20,"AAA");
 Employee e4=new Employee(30,"DDD");
 Employee e5=new Employee(50,"CCC");
 ArrayList al=new ArrayList();
 al.add(e1);
 al.add(e2);
 al.add(e3);
 al.add(e4);
 al.add(e5);
 System.out.println(al);
 for(Object ob:al) {
	 System.out.println(ob);
 }
 System.out.println("ID Sorting");
 Collections.sort(al, new EmpId());
 for(Object ob:al) {
	 System.out.println(ob);
 }
 
 System.out.println("Name Sorting");
 Collections.sort(al, new EmpName());
 for(Object ob:al) {
	 System.out.println(ob);
 }
	}

}
