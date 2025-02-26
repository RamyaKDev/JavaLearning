package com.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put(2,"B");
hm.put(1,"A");
hm.put(4,"B");
hm.put(3,"C");

System.out.println("HashMap :"+hm);

Set s=hm.keySet();
System.out.println(s);

Collection v=hm.values();
System.out.println(v);

Set s1=hm.entrySet();
System.out.println(s1);

Iterator i=s1.iterator();
while(i.hasNext()) {
	//System.out.println(i.next());
	Map.Entry me= (Map.Entry)i.next();
	//System.out.println(me.getKey()+" : "+me.getValue());
	if(me.getKey().equals(3)) {
		me.setValue("P");
	}
	System.out.println(me);
	
	TreeMap tm=new TreeMap(hm);
	System.out.println("TreeMap :"+tm);
}

	}

}
