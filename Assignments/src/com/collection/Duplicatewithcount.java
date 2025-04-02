package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicatewithcount {
	public static void main(String[] args) {
		String s="ammaappaq";
		char[] c=s.toCharArray();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(char ch:c) {
		if(hm.containsKey(ch)) {
			hm.put(ch, hm.get(ch)+1);
		}
		else {
			hm.put(ch,1);
		}		
		}
		System.out.println(hm);
		Set s1=hm.keySet();
		System.out.println(s1);
		Set entry=hm.entrySet();
		System.out.println(entry);
		Iterator itr=entry.iterator();
		while(itr.hasNext()) {
			Entry e=(Entry)itr.next();
			//System.out.println(e.getKey()+" "+e.getValue());
			if(e.getValue().equals(1)) {				
				//e.setValue("4");
				System.out.println(e.getKey()+" "+e.getValue());
			}
			else {
				//System.out.println(e.getKey()+" "+e.getValue());
			}
			
		}
	}
}
