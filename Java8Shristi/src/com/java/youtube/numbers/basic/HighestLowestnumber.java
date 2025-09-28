package com.java.youtube.numbers.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class HighestLowestnumber {

	public static void main(String[] args) {
		// Find the maximum/minimum number in an array/list of numbers
		//Finding largest number
		List<Integer> intList = Arrays.asList(2, 5, 3, 0);
		//first way using max() with comparator implementation
		Optional <Integer> lar= intList.stream()
		.max((n1,n2)->n1.compareTo(n2));
		lar.ifPresent(System.out::println);
		 
		//second way using max() with comparator comparing method
		Optional <Integer> lar1=intList.stream()
		.max(Comparator.comparing(Integer::intValue));//max compares int value
		lar1.ifPresent(System.out::println);
		
		
		//third way using maptoInt()
		OptionalInt lar2=intList.stream()
		.mapToInt(Integer::intValue)
		.max();
		lar2.ifPresent(System.out::println);
		
		//4th way using sort()
		Optional <Integer> lar3=intList.stream()
		.sorted((a,b)->b-a)
		.findFirst();
		if(lar3.isPresent())
			System.out.println(lar3.get());
		
		
		 int[] intArr = new int[] { 1, 3, 2, 4 };
		 OptionalInt largenum= Arrays.stream(intArr).max();
		 largenum.ifPresent(System.out::println);
		 
		 System.out.println("Smallest");
		 
		 Optional <Integer> small= intList.stream()
					.max((n1,n2)->n2.compareTo(n1));
		 		small.ifPresent(System.out::println);
		 
		 OptionalInt smallnum= Arrays.stream(intArr).min();
		 smallnum.ifPresent(System.out::println);
		 
		 //same way modify max to min 
	}

}
