package com.java.streams100;

import java.util.Arrays;
import java.util.List;

public class StreamsAPIQn1 {

	public static void main(String[] args) {
		//1.Given a list of strings, print them in uppercase in alphabetical order.
		List<String> fruits=Arrays.asList("Pappaya","Kiwi","Apple");
		fruits.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		//2.Given a list of strings, print them in uppercase by the length of each element.
		fruits.stream()
		.sorted((s1,s2)->((Integer)s1.length()).compareTo(s2.length()))
		.forEach(System.out::println);
		
		System.out.println();
		//3.Given a list of strings, remove null or empty strings from the list.
		List<String> words=Arrays.asList("Pappa","null","Kiwi","","Ape",null,"Bear");
		words.stream()
		.filter(s->s!=null&&s!="")
		.forEach(System.out::println);
		
		
	}

}
