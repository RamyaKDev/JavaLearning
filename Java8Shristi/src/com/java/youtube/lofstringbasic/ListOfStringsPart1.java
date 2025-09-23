package com.java.youtube.lofstringbasic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListOfStringsPart1 {

	public static void main(String[] args) {
		//1. Convert a list of strings to uppercase , sort them and print
		
		List<String> fruits=Arrays.asList("Strawberry","Kiwi","Orange","Apple","Papaya","Pineapple","Apple");
		fruits.stream()
		//.map(String::toUpperCase)
		.map(str->str.toUpperCase())
		.sorted()
		//.forEach(System.out::println)
		.forEach(str->System.out.println(str));
		
		//2.Get the list of strings where the length of each element is greater than 5 and get the count
		 System.out.println();
		long count=fruits.stream()
		.filter(str->str.length()>5)
		.count();
		System.out.println(count);
		
		//3. Remove duplicates from a list
		 System.out.println();
		Iterator<String> itr=fruits.stream()
		 .distinct()
		 .iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		
		//4. Get the list of strings having a particular word 
		System.out.println();
		fruits.stream()
		.filter((str1)->str1.contains("p"))
		//.filter((str1)->str1.contains("berry"))
		.forEach(System.out::println);
		
		//5. Write a Java program to remove strings that start with a specific word from a list using streams.
		System.out.println();
		fruits.stream()
		.filter(str->!str.startsWith("P"))
		.forEach(System.out::println);
		
		//6. Find the first element in a list that starts with a particular letter
		System.out.println();
		Optional<String> opt=fruits.stream()
		.filter(str->str.startsWith("P"))
		.findFirst();
		if(opt.isPresent())
			System.out.println(opt.get());
		
		//7. Get the length of each name in a list
		System.out.println();
		List<Integer> intst=fruits.stream()
		.map(str->str.length())
		.toList();
		
		System.out.println(intst);
		
		}

}
