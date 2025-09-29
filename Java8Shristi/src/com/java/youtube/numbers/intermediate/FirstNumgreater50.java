package com.java.youtube.numbers.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FirstNumgreater50 {

	public static void main(String[] args) {
		//10. Get the first number greater than 50 in a list/array
		List<Integer> intList = Arrays.asList(73, 50, 33, 11);
		Optional <Integer> opt=intList.stream()
		.filter(num->num>50)
		.findFirst();
		if(opt.isPresent())
			System.out.println(opt.get());
		
		int[] intArr = new int[] { 50, 83, 22, 40 };
		OptionalInt optInt=Arrays.stream(intArr)
		.filter(n1->n1>50)
		.findFirst();
		if(optInt.isPresent())
			System.out.println(optInt.getAsInt());

	}

}
