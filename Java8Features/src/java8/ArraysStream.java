package java8;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArraysStream {

	public static void main(String[] args) {
		
		int[] a= {15,38,29,47,15,56};
		
//	OptionalDouble  i=	Arrays.stream(a)
//		.average();
//	System.out.println(i);
	
//		boolean s=Arrays.stream(a)
//		.anyMatch(no->no%5==0);
//		System.out.println(s);
//		
//		boolean b=Arrays.stream(a)
//				.allMatch(no->no%5==0);
//				System.out.println(b);
				
				Arrays.stream(a)
				.distinct()
				.sorted()
				.forEach(System.out::println);
	}

}
