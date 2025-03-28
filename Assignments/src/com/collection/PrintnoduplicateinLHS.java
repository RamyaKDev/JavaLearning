package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintnoduplicateinLHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Adhithishri";
		LinkedHashSet hs=new LinkedHashSet();
		for(int i=0;i<name.length();i++) {//prints without duplicate
			boolean added=hs.add(name.charAt(i));
			//Prints duplicate
			if(added==false)
			{
				System.out.print(name.charAt(i));
			}
		}
		System.out.print(hs);
		
	}

}
