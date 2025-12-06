package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a= {23,12,67,2,45};
		//normal way
		System.out.println("******normal way*******");
		int largest=0;
		int secondlargest=0;
		for(int i=0;i<a.length;i++) {
			int num=a[i];//23 12 67 2 45
			if(largest<num)//0<23(true) 23<12(false) 23<67(true) 67<2(false) 67<45(false) 
			{
				secondlargest= largest; //0 23
				largest=num; //23 67
			}
			else if((num>secondlargest) && (num!=largest))//45>23 && 45!=67
				secondlargest=num;
		}
		System.out.println("largest "+largest+" secondlargest "+secondlargest);
		
		//java 8 streams api
		System.out.println("****** java 8 streams api- largest ********");
		
		OptionalInt maximum=Arrays.stream(a)
							.max();
		System.out.println(maximum.getAsInt());
		System.out.println("****** java 8 streams api- second largest ********");
		Optional<Integer> secmax=Arrays.stream(a)
		.mapToObj(Integer::valueOf)
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst();
		System.out.println(secmax.get());
	}

}
