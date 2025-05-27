package com.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse_using_StreamAPI {

	public static void main(String[] args) {
		String string="hello";
		String[] strarr=string.split(" ");
		
		String reverseword=Stream.of(strarr)
		.map(word->new StringBuilder(word).reverse())
		.collect(Collectors.joining(" "));
		
		System.out.println(reverseword);
	}

}
