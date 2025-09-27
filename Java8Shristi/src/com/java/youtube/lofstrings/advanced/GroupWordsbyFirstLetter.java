package com.java.youtube.lofstrings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsbyFirstLetter {

	public static void main(String[] args) {
		//14. Given a list of strings, group a list of strings by the first letter of each string using streams
		
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky","Pineapple","Custard","Strawberry");
		Map<Character,List<String>> mapwords=words.stream()
		.collect(Collectors.groupingBy(str->str.charAt(0)));
		mapwords.forEach((key,value)->System.out.println(key+"  "+value));

	}

}
