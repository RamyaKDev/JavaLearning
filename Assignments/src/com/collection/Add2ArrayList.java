package com.collection;

import java.util.ArrayList;

public class Add2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Ramya");
		al.add(10.2f);
		al.add(0, 0);
		al.add(true);
		al.add('a');
		al.add(2L);
		al.add(56.3d);
		al.add(5);
		
		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al.addAll(2, al1);
		System.out.println(al);
	}

}
