package com.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

class ListEx6Employee{
	int id;
	String name;
	ListEx6Employee(int id,String name ){
		this.id=id;
		this.name=name;
	}
}
public class ListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListEx6Employee e1=new ListEx6Employee(10,"AAA");
		ListEx6Employee e2=new ListEx6Employee(20,"BBB");
		ListEx6Employee e3=new ListEx6Employee(30,"CCC");
		ListEx6Employee e4=new ListEx6Employee(40,"DDD");
		ListEx6Employee e5=new ListEx6Employee(50,"EEE");
		ListEx6Employee e6=new ListEx6Employee(60,"FFF");
		
		ArrayList<ListEx6Employee> al= new ArrayList<ListEx6Employee>();
		al.add(e6);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		ListEx6Employee e7=new ListEx6Employee(70,"GGG");
		
		ListIterator<ListEx6Employee> li=al.listIterator();
		li.add(e7);
		while(li.hasNext()) {
			
			ListEx6Employee e12=	li.next();
			if((e12.name).equals("BBB")) {
				li.remove();
			}
			
			
			System.out.println(e12.id+" "+e12.name);
			
			
		}
		
				
	}

}
