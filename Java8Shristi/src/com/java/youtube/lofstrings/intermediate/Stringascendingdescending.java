package com.java.youtube.lofstrings.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stringascendingdescending {

	public static void main(String[] args) {
//		Intermediate
//		8. Sort the list of strings based on their lengths in ascending/descending order.

		//comparing by alphabetical order
		List<String> fruits=Arrays.asList("Pear","Apple","Pineapple","Watermelon","Strawberry","Guava","Apple");
//		fruits.stream()
//		//.sorted()     //- ascending order
//		.sorted((s1, s2) ->s2.compareTo(s1) )//- descending order		
//		.forEach(System.out::println);
		
//		// comparing based on the string length
//		fruits.stream()
//		//.sorted((s1,s2)->((Integer)s1.length()).compareTo(s2.length())) //- ascending order
//		.sorted((s1,s2)->((Integer)s2.length()).compareTo(s1.length())) //- descending order
//		.forEach(System.out::println);
		
		
		//using comparator.comparing() static method
		fruits.stream()
		//.sorted(Comparator.comparing(String::length)) //- ascending order
		.sorted(Comparator.comparing(String::length).reversed())  //- descending order
		.forEach(System.out::println);
	}
	

}
