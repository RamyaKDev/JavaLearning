package com.collection;

import java.util.Arrays;
import java.util.List;

public class PrintInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=Arrays.asList(10,20,30,3.5,3L,true,'d',"hello");
		try {
		for(Object ob:l) {
			Integer i=(Integer) ob;
			System.out.println(ob);
		}
		
		}
		catch(ClassCastException cce) {
			
		}
	}

}
