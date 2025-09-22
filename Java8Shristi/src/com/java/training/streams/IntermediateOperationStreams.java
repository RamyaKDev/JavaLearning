package com.java.training.streams;

import java.util.Arrays;

public class IntermediateOperationStreams {

	public static void main(String[] args) {
		System.out.println("using map");
		String[] one=new String[] {"hi","welcome","hello"};
		Arrays.stream(one)
		.map(str->str.toLowerCase())
		.forEach(System.out::println);
		
		System.out.println("using flatmap");
		String[][] two=new String[][] {{"hi","welcome"},{"hello","bye"}};
		Arrays.stream(two)
		.flatMap(first->Arrays.stream(first))
		.map(str->str.toLowerCase())
		.forEach(System.out::println);
	}

}
