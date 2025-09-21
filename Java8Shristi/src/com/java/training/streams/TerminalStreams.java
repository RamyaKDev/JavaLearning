package com.java.training.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class TerminalStreams {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java", "Spring", "Angular", "Node", "Css", "Html", "Java", "CSS");

		System.out.println("using iterator");
		Iterator<String> itr = courses.stream().filter(str -> str.length() > 4).sorted().iterator();

		while (itr.hasNext()) {
			String course = itr.next();
			System.out.println(course);
		}

		System.out.println();
		System.out.println("using Optional");
		Optional<String> optCourse = courses.stream().filter(str -> str.length() > 4).sorted().findFirst();
		System.out.println(optCourse.get());

		System.out.println();
		System.out.println("using get directly");
		String result = courses.stream().filter(str -> str.length() > 4).sorted().findFirst().get();
		System.out.println(result);

		System.out.println();
		System.out.println("using orElse");
		String result1 = courses.stream().filter(str -> str.length() > 40).sorted().findFirst()
				.orElse("No data present");
		System.out.println(result1);

		System.out.println();
		System.out.println("using orElseGet");
		String result2 = courses.stream().filter(str -> str.length() > 40).sorted().findFirst()
				.orElseGet(() -> "Invalid data".toUpperCase());
		System.out.println(result2);

//		System.out.println();
//		System.out.println("using orElseThrow with inbuilt exception");
//		String result3=courses.stream()
//		.filter(str->str.length()>40)
//		.sorted()
//		.findFirst()
//		.orElseThrow();
//		System.out.println(result3);
//		
//		System.out.println();
//		System.out.println("using orElseThrow using user defined exception");
//		String result4=courses.stream()
//		.filter(str->str.length()>40)
//		.sorted()
//		.findFirst()
//		.orElseThrow(()->new RuntimeException("User defined Exception"));
//		System.out.println(result4);

		System.out.println();
		System.out.println("using reduce");
		int sum = Arrays.stream(new int[] { 10, 20, 30 }).reduce((x, y) -> x + y).getAsInt();
		System.out.println(sum);

		System.out.println();
		System.out.println("using reduce with identity");
		int sum1 = Arrays.asList(10,12,13,14).stream().reduce(100, (x, y) -> x + y);
		System.out.println(sum1);
	}

}
