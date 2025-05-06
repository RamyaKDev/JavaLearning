package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,20,15,25);
		Stream<Integer> s1=l.stream();
		Stream s2=s1.filter(no->no%2!=0);
		s2.forEach(System.out::println);
		// We can write in this way
		System.out.println();
		l.stream()
		.filter(no-> no>15)
		.forEach(System.out::println);
	}

}
