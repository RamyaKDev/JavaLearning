package com.java.youtube.lofstrings.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinSingleword {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky");
		String singleword=words.stream()
		.collect(Collectors.joining("-"));
		
		System.out.println(singleword);
	}

}
