package com.java.training.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator.OfLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamsDemo {

	public static void main(String[] args) {
//		Integer[] m=new Integer[] {1,6,3,8};
//		Stream<Integer> strInt=Stream.of(m);
		
		int[] marks=new int[] {10,30,20,40,50};
		//2 functions are there both returns IntStream
//		IntStream intStr=IntStream.of(marks);
//		IntStream intStr1=Arrays.stream(marks);
		
		//1. find maximum number of 30
		IntStream.of(marks)
				.filter(mark->mark>30)
				.forEach(m->System.out.println(m));
		
		System.out.println();
		
		//2.Find sum and avg
		int sum=IntStream.of(marks).sum();
		System.out.println(sum);
	OptionalDouble op=	IntStream.of(marks).average();
	if(op.isPresent())
	System.out.println(op.getAsDouble());
	
	System.out.println();
	//3.Find the max number
	
	OptionalInt opt= IntStream.of(marks).max();
	opt.ifPresent(System.out::println);
	
	System.out.println();
	//4.Find the min number
	
	IntStream.of(marks).min().ifPresent(m1->System.out.println(m1));
	
	System.out.println();
	System.out.println("using long");
	//5.Find the even number in the range and square it
	//range(include,exclude)
	//rangeClosed(include,include)
	OfLong ol=LongStream.range(10, 20)
	.filter(num->num%2==0)
	.map(num->num*num)
	.iterator();
	
	while(ol.hasNext()) {
		long l=ol.next();
		System.out.println(l);
	}
	
	System.out.println();
	System.out.println("Using double");
	//6.Find the sum using double
	double sum1=DoubleStream.of(10.2,30.2,70.5).sum();
	System.out.println(sum1);
	}

}
