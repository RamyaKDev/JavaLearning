package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintingIntegerStream {

	public static void main(String[] args) {
		List l=Arrays.asList(10,20,30,3.5,3L,true,'d',"hello");
		Stream s1=l.stream();
		try {
		Stream s2=s1.filter(no->(Integer)no==no);
		s2.forEach(System.out::println);
		}
		catch(ClassCastException cce) {
			
		}
	}

}
