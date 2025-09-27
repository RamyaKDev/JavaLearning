package com.java.youtube.lofstrings.intermediate;

import java.util.Arrays;
import java.util.List;

public class Removenullemptystring {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Pear",null,"","null","Guava","Apple","cry","sky");
		words.stream()
		.filter(str->str!=null &&(!str.isEmpty()))
		.forEach(str->System.out.println(str));

	}

}
