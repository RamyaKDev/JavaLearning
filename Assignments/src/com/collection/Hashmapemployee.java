package com.collection;


import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hashmapemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> employee=new TreeMap<Integer,String>();
employee.put(4, "CCC");
employee.put(2, "BBB");
employee.put(6, "AAA");
System.out.println("employee id and employee name ");
System.out.println(employee);
Set s=employee.keySet();
System.out.println("employee id  ");
System.out.println(s);
Collection c=employee.values();
System.out.println("employee name ");
System.out.println(c);
Set s1=employee.entrySet();
System.out.println("employee id and employee name ");
System.out.println(s1);//we retrieved id and name

int find=21;//searching using key
System.out.println(employee.containsKey(find)+" "+find+" does not");
Iterator itr=s1.iterator();

while(itr.hasNext()) {
	Entry entry=(Entry)itr.next();
	Integer i=(int)entry.getKey();
	if(i==find) {		
		System.out.println(find+" "+entry.getValue());		
	}	

	}
	}
}
