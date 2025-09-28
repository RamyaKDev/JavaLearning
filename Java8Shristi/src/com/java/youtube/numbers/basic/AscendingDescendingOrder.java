package com.java.youtube.numbers.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscendingDescendingOrder {

	public static void main(String[] args) {
		// 3.Sort a list of integers in descending/ascending order 
		
		//Ascending order
	List<Integer> intList=Arrays.asList(99,10,83,45,23,67,98);
//		
//		intList.stream()
//		.sorted()
//		.forEach(System.out::println);
//		
//		System.out.println();
//		
		int[] intNum=new int[] {10,23,45,3,67,98};
//		Arrays.stream(intNum)
//		.sorted()
//		.forEach(System.out::println);
//----------------------------------------------------------
		//Descending order
		
		intList.stream()
		//.sorted((a,b)->b-a)
		//.sorted(Comparator.comparingInt(n->Integer.intValue(n)).reversed())
		.sorted(Comparator.comparingInt(Integer::intValue).reversed())
		.forEach(System.out::println);
		
		System.out.println();
		
		Arrays.stream(intNum)
		//.mapToObj(num->Integer.valueOf(num))
		.mapToObj(Integer::valueOf)
		//.boxed() //converts int to Stream<Integer>
		.sorted(Comparator.comparingInt(Integer::intValue).reversed())
		//.sorted((a,b)->b-a)
		.forEach(System.out::println);
	}

}
