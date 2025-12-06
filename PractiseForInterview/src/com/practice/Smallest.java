package com.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Smallest {

	public static void main(String[] args) {
		int[] a= {23,12,67,2,9};
		//normal way
		System.out.println("******normal way*******");
		int len=a.length;
		int smallest=a[0];
		for(int i=0;i<len;i++) {
			
			if(smallest>a[i]) {
				smallest=a[i];
			}
		}
		System.out.println("smallest number is "+smallest);

		//java 8 streams api
		System.out.println("****** java 8 streams api ********");
	OptionalInt minimum=	Arrays.stream(a)
							.min();
	System.out.println(minimum.getAsInt());
	}

}
