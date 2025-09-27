package com.java.youtube.lofstrings.intermediate;

import java.util.Arrays;
import java.util.List;

public class VowelWords {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky");
		words.stream()
		//.filter(str->str.matches(".*[a,e,i,o,u].*")) //vowel
		.filter(str->!str.matches(".*[a,e,i,o,u].*")) //consonants
		.forEach(System.out::println);

	}

}
