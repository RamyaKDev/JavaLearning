package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class genericint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		//al.add("hello");
		System.out.println(al);
		int total=0;
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			int i=(int)itr.next();
			total=total+i;
		}
		System.out.println(total);
	}

}
