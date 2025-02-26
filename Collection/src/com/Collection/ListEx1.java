package com.Collection;

import java.util.ArrayList;

public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add("AAA");
al.add('a');
al.add(true);
al.add(null);
al.add(10);
al.add(20);
al.add(0,100);
System.out.println("size method "+al.size());
System.out.println("get method "+al.get(1));
System.out.println("remove method "+al.remove(2));
System.out.println("Add based on index "+al.add(600));
System.out.println("Contains "+al.contains("AAb"));
System.out.println("Hetergeneous arraylist data "+al);

ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(10);
a1.add(20);
a1.add(10);
a1.add(20);
a1.add(10);
a1.add(20);
System.out.println("Hetergeneous arraylist data "+a1);
	}

}
