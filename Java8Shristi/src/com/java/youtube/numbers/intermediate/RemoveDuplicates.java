package com.java.youtube.numbers.intermediate;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//6. Remove duplicate elements from an array/list of integers
		List<Integer> intList = Arrays.asList(3, 5, 3, 0);
		intList.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println();
		
		int[] intArr = new int[] { 1, 3, 4, 4 };
		Arrays.stream(intArr).distinct().forEach(System.out::println);
		
	}

}
