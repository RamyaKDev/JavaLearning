package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(20);
		a1.add(10);
		a1.add(200);
		a1.add(60);
		a1.add(30);
		System.out.println("Hetergeneous arraylist data before sorting "+a1);
		Collections.sort(a1);
		System.out.println("Hetergeneous arraylist data after sorting "+a1);
		
		
		
	}

}
