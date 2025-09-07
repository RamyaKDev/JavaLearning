package com.streammap;

import java.util.Arrays;
import java.util.List;

public class AddEvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,23,12,34,11,67,89);
		int sumofint=numbers.stream().filter(num->num%2==0)
		//.forEach(System.out::println);
		.mapToInt(num->num.intValue())
		.sum();
		
		System.out.println(sumofint);
	}
}
