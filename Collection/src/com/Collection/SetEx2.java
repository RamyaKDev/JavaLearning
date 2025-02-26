package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(70);
		hs.add(90);
		hs.add(null);
		hs.add("RRRR");
		hs.add('t');
		hs.add(10.0f);
		hs.add('t');
		hs.add(90);
		
		System.out.println("hash set "+hs);

		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterator "+itr.next());
		}
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("aaa");
		ls.add("ggg");
		ls.add("yyy");
		ls.add("qqq");
		ls.add("rrr");
		ls.add("ttt");
		
		System.out.println("Linked hash set "+ls);

	}

}
