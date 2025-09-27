package com.java.youtube.lofstrings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoListwithVowelNoVowel {

	public static void main(String[] args) {
		
		//17. Given a list of strings, group the list of strings with vowels and no vowels into two lists
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky","Pineapple","Custard","Strawberry");
		Map <Boolean, List <String>> mapwords= 	words.stream()
		.collect(Collectors.partitioningBy(str->str.matches(".*[aeiou].*")));
		
		System.out.println(("Vowels"+mapwords.get(true)));
		System.out.println(("No Vowels"+mapwords.get(false)));
		System.out.println();
		mapwords.forEach((key,value)->System.out.println(key+" "+value));
		

	}

}
