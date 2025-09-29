package com.java.youtube.numbers.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionIntoEvenOddNum {

	public static void main(String[] args) {
		//13. Partition an array of integers into two groups: even and odd using Streams.
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
		Map <Boolean, List <Integer>> mapnum= intList.stream()
		 .collect(Collectors.partitioningBy(n->n%2==0));
		 System.out.println("even numbers "+mapnum.get(true));
		 System.out.println("odd numbers "+mapnum.get(false));
		 
		 int[] intArr = new int[] { 1, 3, 2, 4 };
			Arrays.stream(intArr)
			.mapToObj(n->Integer.valueOf(n))//Integer::valueOf
			.collect(Collectors.partitioningBy(n->n%2==0))
			.forEach((k,v)->System.out.println(k+" "+v));
	}

}
