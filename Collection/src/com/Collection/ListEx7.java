package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ListEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"AAA","BBB","CCC"};
ArrayList<String> a=new ArrayList<String>(Arrays.asList(s));
for(String str:a) {
	System.out.println(str);
	
}
ArrayList a1=new ArrayList();
a1.add(10);
a1.add('a');
a1.add(true);
a1.add(10.0f);

Object obj[]=a1.toArray();
for(Object o: obj) {
	System.out.println(o);
}
	}

}
