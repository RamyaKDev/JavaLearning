package com.java.youtube.lofstrings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupWordsbyLastLetter {

	public static void main(String[] args) {
		
		//16. Given a list of strings, create a map where the key is the last letter of the string, 
		//and the value is a list of strings that end with that letter using streams
		
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky","Pineapple","Custard","Strawberry");
		words.stream()
		.collect(Collectors.groupingBy(str->str.charAt(str.length()-1)))
		.forEach((key,value)->System.out.println(key+"  "+value));
	}

}
