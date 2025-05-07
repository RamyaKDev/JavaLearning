package com.streammap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collectionmap {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		System.out.println(hm);
		Set s=hm.entrySet();
		for(Object ob:s) {
			Entry entry=(Entry)ob;
			if((Integer)entry.getKey()==2)
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
