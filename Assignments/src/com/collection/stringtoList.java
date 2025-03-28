package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class stringtoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="RamyaKamalasekaran";
		char[] c=name.toCharArray();
		ArrayList al=new ArrayList();
		for(int i=0;i<c.length;i++) {
			al.add(c[i]);
		}
		System.out.println(al);
		LinkedHashSet hs= new LinkedHashSet(al);
		System.out.println(hs);

	}

}
