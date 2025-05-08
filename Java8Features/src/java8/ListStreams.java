package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListStreams {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,3,2,5,4,9,3,2,5,6);
//		Long no=l.stream()
//		.count();
//		System.out.println(no);
		
//		l.stream()
//		.distinct()
//		.forEach(System.out::println);
		
//		List<Integer> noList=l.stream()
//		.filter(no->no%2==0)
//		.collect(Collectors.toList());
//		System.out.println(noList);
//		
//		l.stream()
//		.limit(4)
//		.forEach(System.out::println);
//		
//		l.stream()
//		.distinct()
//		.sorted()
//		.forEach(System.out::println);
		
//		l.stream()
//		.distinct()
//		.sorted((no1,no2)->no1.compareTo(no2))
//		.forEach(System.out::println);
		
//		l.stream()
//		.distinct()
//		.sorted((no1,no2)->no2.compareTo(no1))
//		.forEach(System.out::println);

//		Optional<Integer> no=l.stream()
//		.min((no1,no2)->no1.compareTo(no2));		
//		System.out.println(no.get());
		
//		Optional<Integer> no=l.stream()
//				.max((no1,no2)->no1.compareTo(no2));		
//				System.out.println(no.get());
				
//				Optional<Integer> no=	l.stream()
//				.reduce((no1,no2)->no1+no2);
//				System.out.println(no.get());
		
		l.stream()
		.dropWhile(no->no>5)
		.forEach(System.out::println);
	}

}
