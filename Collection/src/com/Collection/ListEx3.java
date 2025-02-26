package com.Collection;

import java.util.ArrayList;

class NEmployee{
	int id;
	String name;
	NEmployee(int id,String name ){
		this.id=id;
		this.name=name;
	}
}
public class ListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e=new Employee(10,"AAA");
		//Employee e11=new Employee(20,"BBB");
		//Employee e12=new Employee(10,"AAA");
		//Employee e13=new Employee(20,"BBB");
		//Employee e14=new Employee(10,"AAA");
		//Employee e15=new Employee(20,"BBB");
		
		ArrayList<NEmployee> a=new ArrayList<NEmployee>();
		a.add(new NEmployee(10,"AAA"));
		a.add(new NEmployee(20,"BBB"));
		a.add(0,new NEmployee(30,"CCC"));
		a.add(new NEmployee(40,"DDD"));
		a.add(new NEmployee(50,"EEE"));
		a.add(new NEmployee(60,"FFF"));
		System.out.println(a);
		
		//ArrayList<NEmployee> a1=new ArrayList<NEmployee>(a);
		ArrayList<NEmployee> a1=new ArrayList<NEmployee>();
		a1.addAll(a);
		System.out.println(a1.containsAll(a));
		
		System.out.println(a1.isEmpty());
		a1.add(new NEmployee(100,"AAAA"));
		a1.add(new NEmployee(200,"BBBB"));
		//a1.removeAll(a);
		//a1.retainAll(a);
		//a1.clear();
		//System.out.println(a1.isEmpty());
		
		NEmployee e3=(NEmployee)a1.get(5);
		System.out.println(e3.id+" "+e3.name);
		
		for(NEmployee emp:a1) {
			System.out.println(emp.id+" "+emp.name);
		}
	}

}
