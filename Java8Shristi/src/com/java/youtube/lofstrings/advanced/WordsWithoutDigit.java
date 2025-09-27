package com.java.youtube.lofstrings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsWithoutDigit {

	public static void main(String[] args) {
		//18. Given a list of strings print only the string elements excluding the digits using streams.
		List<String> words=Arrays.asList("Pear","Guava3","Apple4","cry","sky","123","Pineapple1");
		Map <Boolean, List <String>> mapwords=words.stream()
		.collect(Collectors.partitioningBy(str->str.matches(".*[0-9].*")));
		
		mapwords.forEach((key,value)->System.out.println(key+" "+value));
		System.out.println();
		System.out.println("With digit "+mapwords.get(true));
		System.out.println("No digit "+mapwords.get(false));
	}

}
