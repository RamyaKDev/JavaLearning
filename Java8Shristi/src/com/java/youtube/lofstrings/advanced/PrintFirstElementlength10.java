package com.java.youtube.lofstrings.advanced;

import java.util.Arrays;
import java.util.List;


public class PrintFirstElementlength10 {

	public static void main(String[] args) {
		
		//19. Given a list of strings find the first element having the length as 10 if not handle exceptions
		
		List<String> words=Arrays.asList("Pear","Guava","Apple","cry","sky","pineapplerere","strawberryy");
		String opt=words.stream()
		.filter(str->str.length()>10)
		.findFirst()	
		.orElseThrow(()->new RuntimeException("No such word in length 10"));
		System.out.println(opt);
		
	}

}
