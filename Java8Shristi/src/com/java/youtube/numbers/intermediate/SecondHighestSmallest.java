package com.java.youtube.numbers.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestSmallest {

	public static void main(String[] args) {
		//9. Get the second largest number and second smallest number in a list/array 
		
		//Second highest
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
		Optional<Integer> secHigh=intList.stream()
		.sorted((a,b)->b-a)
		.skip(1)
		.findFirst();
		secHigh.ifPresent(System.out::println);
		
		
		int[] intArr = new int[] { 5, 3, 2, 4 };
		
		Optional<Integer> secLarge=Arrays.stream(intArr)
		.mapToObj(Integer::valueOf)
		.sorted((a,b)->b-a)
		.skip(1)
		.findFirst();
		secLarge.ifPresent(System.out::println);
		
		//second smallest number
		Optional<Integer> secLow=intList.stream()
				.sorted()
				.skip(1)
				.findFirst();
		secLow.ifPresent(System.out::println);
				
				
				Optional<Integer> secSmall=Arrays.stream(intArr)
						.mapToObj(Integer::valueOf)
						.sorted()
						.skip(1)
						.findFirst();
				secSmall.ifPresent(System.out::println);
	}

}
