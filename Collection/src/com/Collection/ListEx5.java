package com.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("AAA");
		a.add("BBB");	
		a.add("CCC");
		a.add("DDD");
		
		ListIterator li=a.listIterator();
		while(li.hasNext()) {
			System.out.println("Forward "+li.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println("Reverse "+li.previous());
		
		}
		
	}

}
