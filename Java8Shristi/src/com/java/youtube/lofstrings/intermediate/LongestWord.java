package com.java.youtube.lofstrings.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWord {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Pear","Apple","Pineapple","Watermelon","Strawberry","Guava","Apple");
		Optional<String> fruit=fruits.stream()
		.max(Comparator.comparing(String::length));
		
		//fruit.ifPresent(System.out::println);  //-another way 
		if(fruit.isPresent())
			System.out.println(fruit.get());
		}

}
