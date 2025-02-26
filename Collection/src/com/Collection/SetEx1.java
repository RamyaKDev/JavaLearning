package com.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetEx1 {
public String toString() {
	return "ABC";
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetEx1 se=new SetEx1();
		
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
hs.add(se);
System.out.println("hash set "+hs);

LinkedList ll=new LinkedList();
ll.add(10);
ll.add(70);
ll.add(90);
ll.add(null);
ll.add("RRRR");
ll.add('t');
ll.add(10.0f);
ll.add('t');
ll.add(90);
System.out.println("Linked List "+ll);

LinkedHashSet ls=new LinkedHashSet(ll);
ls.add(270);
ll.add(70);
ll.add(90);
ls.add(170);
ls.addAll(hs);
System.out.println("Linked Hash Set "+ls);
//System.out.println("Linked Hash Set "+ls);

Object[] obj=ls.toArray();
for(Object o:obj) {
	System.out.println(o);
}
	}

}
