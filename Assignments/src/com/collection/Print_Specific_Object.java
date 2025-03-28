package com.collection;

import java.util.ArrayList;

public class Print_Specific_Object {

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
		for(Object ob : al) {
			try {
			Integer i= (Integer) ob;
			System.out.println(i);
			}catch(ClassCastException ce) {
				
			}
		}
	}

}
