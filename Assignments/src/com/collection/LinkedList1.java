package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al=new LinkedList();
		al.add(10);
		al.add("Ramya");
		al.add(10.2f);
		al.add(0, 0);
		al.add(true);
		al.add('a');
		al.add(2L);
		al.add(56.3d);
		al.add(5);
		
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		al.remove(10.2f);
		System.out.println(al);
		System.out.println(al.contains(100));
		System.out.println(al.get(2));
		//Printing values one by one 
		//in 3 ways for loop, enhanced for , iterator
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		for(Object ob:al) {
			System.out.println(ob);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
