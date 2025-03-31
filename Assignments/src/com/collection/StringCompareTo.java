package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class StringCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="S";
		String name2="A";
		//String name3="M";
		int a1,a2;
		a1=name1.compareTo(name2);
		a2=name2.compareTo(name1);
		//a3=name3.compareTo(name1);
		if(a1<a2 )
			System.out.println("S comes first");
		else	
			System.out.println("A comes first");  
//			 
	}

}
