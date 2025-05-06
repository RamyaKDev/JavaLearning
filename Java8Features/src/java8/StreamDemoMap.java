package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoMap {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,20,15,25);
		Stream<Integer> s1=l.stream();
		Stream s2=s1.map(num->num*2);
		s2.forEach(System.out::println);

		System.out.println();
		l.stream()
		.map(no->no/5)
		.forEach(System.out::println);
	}

}
