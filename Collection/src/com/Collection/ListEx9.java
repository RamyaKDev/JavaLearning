package com.Collection;

import java.util.ArrayList;
import java.util.Collections;


class ListEx9Emp implements Comparable{
	int id;
	String name;
	ListEx9Emp(int id,String name ){
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		ListEx9Emp e1=(ListEx9Emp)o;
		if(id==e1.id) {
			return id; 
		}else if(id>e1.id){
			return 1;
		}else
			
			return -1;
	}
}
public class ListEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListEx9Emp e3=new ListEx9Emp(30,"CCC");
		ListEx9Emp e1=new ListEx9Emp(10,"AAA");
		
		ListEx9Emp e6=new ListEx9Emp(60,"FFF");
		
		ListEx9Emp e4=new ListEx9Emp(40,"DDD");
		ListEx9Emp e2=new ListEx9Emp(20,"BBB");
		ListEx9Emp e5=new ListEx9Emp(50,"EEE");
		
		ArrayList al= new ArrayList();
		al.add(e6);
		al.add(e5);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e1);
		System.out.println(al);
		
		Collections.sort(al);
		
		for(Object obj: al) {
			if(obj instanceof ListEx9Emp) {
				ListEx9Emp e=(ListEx9Emp)obj;
				System.out.println(e.id+" "+e.name);
			}
			
		}
	}

}
