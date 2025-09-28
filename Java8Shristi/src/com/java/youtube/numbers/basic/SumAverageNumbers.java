package com.java.youtube.numbers.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SumAverageNumbers {

	public static void main(String[] args) {
		// 4. Calculate the sum and average of numbers in an array and list of numbers

		// Sum
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
		int sum = intList.stream()
				// .mapToInt(n->Integer.valueOf(n))
				.mapToInt(Integer::valueOf).sum();
		// .reduce(0, (x,y)->x+y);//it returns Integer
		System.out.println(sum);
		System.out.println();

		Optional<Integer> sum1 = intList.stream().reduce((x, y) -> x + y);// it returns Optional
		sum1.ifPresent(System.out::println);

		System.out.println();

		int[] intArr = new int[] { 1, 3, 2, 4 };
		int total = Arrays.stream(intArr).sum();

		System.out.println(total);

		// Average

		OptionalDouble avg = Arrays.stream(intArr).average();
		avg.ifPresent(n1 -> System.out.println(n1));
		System.out.println();
		
		double avg1=intList.stream()
		.collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(avg1);
		
		OptionalDouble avg2 =intList.stream()
		.mapToDouble(Double::valueOf)
		.average();
		avg2.ifPresent(n2 -> System.out.println(n2));
	
	}

}
