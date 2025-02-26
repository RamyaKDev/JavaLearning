package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ListEmp10{
	int id;
	String name;
	ListEmp10(int id,String name ){
		this.id=id;
		this.name=name;
	}
}
class EmpId implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		 ListEmp10 e1=(ListEmp10) o1;
		 ListEmp10 e2=(ListEmp10) o2;
		 if(e1.id==e2.id) {
			 return 0; 
		 }else if(e1.id>e2.id){
			 return 1;
		 }else
			 return -1;
		
	}
	
}

class EmpName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		 ListEmp10 e1=(ListEmp10) o1;
		 ListEmp10 e2=(ListEmp10) o2;
		 return e1.name.compareTo(e2.name);
	}
}
public class ListEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ListEmp10 e3=new  ListEmp10(40,"CCC");
		 ListEmp10 e1=new  ListEmp10(90,"AAA");
		
		 ListEmp10 e6=new  ListEmp10(60,"FFF");
		
		 ListEmp10 e4=new  ListEmp10(70,"DDD");
		 ListEmp10 e2=new  ListEmp10(20,"BBB");
		 ListEmp10 e5=new  ListEmp10(50,"EEE");
		
		ArrayList al= new ArrayList();
		al.add(e6);
		al.add(e5);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e1);
		System.out.println("ID Sorting");
		
		Collections.sort(al,new EmpId());
		
		for(Object obj: al) {
			if(obj instanceof ListEmp10) {
				ListEmp10 e=(ListEmp10)obj;
				System.out.println(e.id+" "+e.name);
			}
			
	}
		System.out.println("Name Sorting");

		Collections.sort(al,new EmpName());
		
		for(Object obj: al) {
			if(obj instanceof ListEmp10) {
				ListEmp10 e=(ListEmp10)obj;
				System.out.println(e.id+" "+e.name);
			}
			
	}

	}}
