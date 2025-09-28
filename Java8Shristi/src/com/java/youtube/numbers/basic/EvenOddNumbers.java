package com.java.youtube.numbers.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class EvenOddNumbers {

	public static void main(String[] args) {
//		Basics 
//
//		1. Get the even/odd numbers from an array of numbers and list of numbers

//		List<Integer> intList=Arrays.asList(10,23,45,23,67,98);
//		intList.stream()
//		.filter(num->num%2==0)
//		.forEach(System.out::println);
//		
//		System.out.println();
//		
//		int[] a=new int[] {10,23,45,23,67,98};
//		Arrays.stream(a)
//		.filter(num->num%2!=0)
//		.forEach(System.out::println);
		
		//2.Get the even/odd numbers between a range 
		IntStream.rangeClosed(0, 10)//to include end value used rangeclosed()
		.filter(num->num%2==0)
		.forEach(System.out::println);
		
		System.out.println();
		IntStream.range(0, 10)
		.filter(num->num%2!=0)
		.forEach(System.out::println);
	}

}
