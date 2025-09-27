package com.java.youtube.lofstrings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseStringList {

	public static void main(String[] args) {
		//20.Reverse the list of strings using streams api 
		
		List<String> fruits=Arrays.asList("Pear","Guava","Apple","Kiwi","Strawberry");
		
		IntStream.range(0, fruits.size())
		.mapToObj(i->fruits.get(fruits.size()-1-i))
		//.map(str->new StringBuffer(str).reverse())
		.forEach(System.out::println);

	}

}
