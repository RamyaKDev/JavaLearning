package com.java.youtube.numbers.advanced;

import java.util.Arrays;
import java.util.List;

public class SumOf2DArrListOfListOfInt {

	public static void main(String[] args) {
		//11. Get the sum of numbers of a two dimensional array and list of list of integers
		int[][] arr=new int[][]{
			{2,4,1},
			{3,1,5},
			{5,1,2}
		};
		int sum=Arrays.stream(arr)
		.flatMapToInt(num->Arrays.stream(num))
		.sum();
		System.out.println(sum);
		
		List<List<Integer>> intList=Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6));
		
		sum=intList.stream()
		.flatMap(l->l.stream())
		.mapToInt(Integer::intValue)
		.sum();
		System.out.println(sum);
	}

}
