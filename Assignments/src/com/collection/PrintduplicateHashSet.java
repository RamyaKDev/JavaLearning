package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PrintduplicateHashSet {
//Remove duplicates
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Adhithishri";
		HashSet hs=new HashSet();
		for(int i=0;i<name.length();i++) {//prints without duplicate
			boolean added=hs.add(name.charAt(i));
			//Prints duplicate
			if(added==false)
			{
				System.out.print(name.charAt(i));
			}
		}
		//System.out.print(hs);
		

	}

}
