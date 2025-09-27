package com.java.youtube.lofstrings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupWordsbyLength {

	public static void main(String[] args) {
		
		//15. Given a list of strings, group a list of strings by the length of the string
		
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky","Pineapple","Custard","Strawberry");
		words.stream()
		.collect(Collectors.groupingBy(str->str.length()))
		.forEach((key,value)->System.out.println(key+"  "+value));
		
		
	}

}
