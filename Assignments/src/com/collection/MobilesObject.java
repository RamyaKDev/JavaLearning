package com.collection;

import java.util.ArrayList;

public class MobilesObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1=new Mobiles("Samsung",15000,4);
		Mobiles m2=new Mobiles("Apple",25000,4);
		Mobiles m3=new Mobiles("Moto",12000,6);
		m1.display();
		m2.display();
		m3.display();
		ArrayList al=new ArrayList();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		System.out.println(al);
		int price=0;
		String mbrand=" ";
		for(Object ob:al) {
			//System.out.println(ob);
			Mobiles mobile=(Mobiles) ob;
			//System.out.println(mobile);
			if(mobile.price>price) {
				price=mobile.price;
				mbrand=mobile.brand;
			}
			
				
			
		}
		System.out.println(price+" "+mbrand);
	}

}
