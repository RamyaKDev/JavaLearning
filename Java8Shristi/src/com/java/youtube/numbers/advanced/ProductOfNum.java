package com.java.youtube.numbers.advanced;

import java.util.Arrays;
import java.util.List;

public class ProductOfNum {

	public static void main(String[] args) {
		//14. Calculate the product of all numbers in the array using reduce
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
		int product=intList.stream()
		.reduce(1, (x,y)->x*y);
		System.out.println(product);
		
		 int[] intArr = new int[] { 1, 3, 2, 4 };
		 product=Arrays.stream(intArr)
			.mapToObj(Integer::valueOf)
			.reduce(1, (x,y)->x*y);
			System.out.println(product);
	}

}
