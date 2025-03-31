package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1=new Mobiles("Samsung",15000,4);
		Mobiles m2=new Mobiles("Apple",25000,4);
		Mobiles m3=new Mobiles("Moto",12000,6);
		
		
		ArrayList al=new ArrayList();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		System.out.println(al);
	Collections.sort(al);

		
	}

}
