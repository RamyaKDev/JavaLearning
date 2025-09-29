package com.java.youtube.numbers.advanced;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {
		//15.implement a parallel stream that computes the sum of squares of numbers in an array. 
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
		int sum = intList.stream()
				.mapToInt(Integer::valueOf)
				.map(n->n*n)
				.sum();
		
		System.out.println(sum);
		
		System.out.println();

		int[] intArr = new int[] { 1, 3, 2, 4 };
		int total = Arrays.stream(intArr)
				.map(n->n*n)
				.sum();
		System.out.println(total);

	}

}
