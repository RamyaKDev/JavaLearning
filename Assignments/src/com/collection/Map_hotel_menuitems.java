package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map_hotel_menuitems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("Idli", 20);
		hm.put("Dosa", 15);
		hm.put("Pongal", 30);
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Set ss=hm.entrySet();
		System.out.println(ss);
		int total=0;
		Iterator itr=ss.iterator();
		while(itr.hasNext()) {
			Entry entry=(Entry)itr.next();
			int i=(int)entry.getValue();
			total=total+i;
			}
		System.out.println(total);
		}
	}


