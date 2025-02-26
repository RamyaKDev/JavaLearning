package com.Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;


public class TreesetEx {
	public static void main(String[] args) {
		
	LinkedList ll=new LinkedList();
	ll.add(10);
	ll.add(70);
	ll.add(90);
	ll.add(40);
	ll.add(20);
	ll.add(100);
	ll.add(90);
	System.out.println("Linked List "+ll);
	
	TreeSet ts=new TreeSet(ll);
	//ts.add("aaa");
	//ts.add(null);
	
	System.out.println("Tree Set "+ts);
	System.out.println("Tree Set before 40 "+ts.headSet(40));
	System.out.println("Tree Set after 40"+ts.tailSet(40));
	System.out.println("Tree Set subset "+ts.subSet(20, 90));
}
}