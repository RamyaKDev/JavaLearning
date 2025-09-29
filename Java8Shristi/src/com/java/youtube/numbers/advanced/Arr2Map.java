package com.java.youtube.numbers.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arr2Map {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2, 5, 3, 1);
	 intList.stream()
	 .collect(Collectors.toMap(num->num, value->value*value))
	 .forEach((k,v)->System.out.println(k+" "+v));
		
		int[] intArr = new int[] { 1, 3, 2, 4 };
		Arrays.stream(intArr)
		.mapToObj(n->Integer.valueOf(n))//Integer::valueOf
		 .collect(Collectors.toMap(num->num, value->value*value))
		 .forEach((k,v)->System.out.println(k+" "+v));
		

	}

}
