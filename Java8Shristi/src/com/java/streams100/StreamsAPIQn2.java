package com.java.streams100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsAPIQn2 {

	public static void main(String[] args) {
		//4. Given a list of nums, square each number in the list.
		List<Integer> nums=Arrays.asList(10,2,55,3);
		nums.stream()
		.map(n->n*n)
		.forEach(System.out::println);
		
		System.out.println();
		//5.Given a list of nums, find the largest number in the list.
		Optional<Integer> large=nums.stream()
		.sorted(Comparator.comparing(Integer::intValue).reversed())
		.findFirst();
		large.ifPresent(System.out::println);
		
		System.out.println();
		//Given an array of numbers, find the largest number in the list
		int[] a=new int[] {23,12,1,5,89};
		Arrays.stream(a)
		.max()
		.ifPresent(System.out::println);
		
	}

}
