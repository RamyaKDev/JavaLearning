package com.java.youtube.numbers.intermediate;

import java.util.Arrays;
import java.util.List;

public class SumofSquares {

	public static void main(String[] args) {
		//8.Find the sum of squares of all the numbers in the array/list. 
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
		int ssum=intList.stream()
		.map(n->n*n)
		.reduce(0, (x,y)->x+y);
		System.out.println(ssum);

		int[] intArr = new int[] { 5, 3, 2, 4 };
		ssum=Arrays.stream(intArr)
		.map(n->n*n)
		.sum();
		System.out.println(ssum);
	}

}
