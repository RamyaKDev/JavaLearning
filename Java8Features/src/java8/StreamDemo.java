package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
	List l=Arrays.asList(10,20,15,25);
	Stream s1=l.stream();
	s1.forEach(System.out::println);
	//s1.forEach(System.out::println);
	}

}
