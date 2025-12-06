package com.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Largest {

	public static void main(String[] args) {
		int[] a= {23,12,67,2,9};
		//normal way
				System.out.println("******normal way*******");
				int len=a.length;
				int largest=a[0];
				for(int i=0;i<len;i++) {
					
					if(largest<a[i]) {
						largest=a[i];
					}
				}
				System.out.println("largest number is "+largest);

				//java 8 streams api
				System.out.println("****** java 8 streams api ********");
			OptionalInt maximum=	Arrays.stream(a)
									.max();
			System.out.println(maximum.getAsInt());

	}

}
