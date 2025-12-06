package practiseytstreams;

import java.util.Arrays;
import java.util.List;

public class Stringbasics {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("Hello","World","New","School","New");
//		str.stream()
//		.map(String::toUpperCase)
//		.sorted()
//		.forEach(st->System.out.println(st));

		
//	long counts=	str.stream()
//		.filter(s->s.length()>5)
//		.count();
//	System.out.println(counts);
	
		str.stream()
		.distinct()
		.forEach(st->System.out.println(st));
		
		
	
	}

}
