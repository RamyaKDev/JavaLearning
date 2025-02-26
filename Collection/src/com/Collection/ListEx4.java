package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ListEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("AAA");
		a.add("BBB");	
		a.add("CCC");
		a.add("DDD");
		//System.out.println(a);
		//Instead of S.O.P use Iterator
		
		System.out.println("Iterator with Generic collection");
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		ArrayList a1=new ArrayList();
		a1.add("AAA");
		a1.add("BBB");	
		a1.add("CCC");
		a1.add("DDD");
		//System.out.println(a);
		System.out.println("Iterator without Generic collection - use typecasting in next() ");
		Iterator i1=a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
