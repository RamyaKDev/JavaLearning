package com.java.youtube.lofstrings.intermediate;

import java.util.Arrays;
import java.util.List;

public class ReverseEachwordinList {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky");
		
		words.stream()
		.map(str->new StringBuffer(str).reverse())
		//.forEach(System.out::println);
		.forEach(str->System.out.println(str));

	}

}
