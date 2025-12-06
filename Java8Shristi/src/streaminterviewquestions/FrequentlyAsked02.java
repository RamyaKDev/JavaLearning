package streaminterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequentlyAsked02 {

	public static void main(String[] args) {
		List<Integer> lt=Arrays.asList(10,23,12,35,11);
		lt.stream()
		//.filter(n->n%2==0)
		.filter(n->n%2!=0)
		.forEach(System.out::println);
		
		//Separating a list to even and odd number
		 Map <Boolean, List <Integer>> m=	lt.stream()
		.collect(Collectors.partitioningBy(n->n%2==0));
		 System.out.println("Even "+ m.get(true));
		 System.out.println("Odd "+ m.get(false));
	}

}
