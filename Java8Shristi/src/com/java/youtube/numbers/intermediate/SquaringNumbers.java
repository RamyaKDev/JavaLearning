package com.java.youtube.numbers.intermediate;

import java.util.Arrays;
import java.util.List;

public class SquaringNumbers {

	public static void main(String[] args) {
	//	7. Convert a list/array of integers to a list of their squares and print them
		
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
			intList.stream()
			//.map(n->n*n)
			.mapToDouble(n->Math.pow(n, 2))//prints double val for inbuilt Maths fun
			.mapToInt(doubleval->(int)doubleval)//prints with .0 so converting again to int
		.forEach(num->System.out.println(num));
		
			System.out.println();
			
		int[] intArr = new int[] { 5, 3, 2, 4 };
		Arrays.stream(intArr)
		.mapToObj(n->n*n)
		.forEach(num->System.out.println(num));

	}

}
