package com.java.training.streams;

import java.util.Arrays;
import java.util.List;

public class First {

	public static void main(String[] args) {
		List<String> courses=Arrays.asList("Java","HTML","CSS","Spring","AWS");
		courses.stream()
		.sorted()
		.forEach(str->System.out.println(str));

	}

}
