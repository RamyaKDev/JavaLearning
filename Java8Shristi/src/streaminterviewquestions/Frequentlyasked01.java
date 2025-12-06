package streaminterviewquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Frequentlyasked01 {
	public static void main(String[] args) {
		List<Integer> lt=Arrays.asList(10,23,12,35,11);
		//Program:1
		System.out.println("Finding max value in a list");
		//Approach-1
		Optional<Integer> i=lt.stream()
		.sorted((a,b)->b-a)
		.findFirst();
		i.ifPresent(n->System.out.println(n));
		
		//Approach-2
		Optional<Integer> it=lt.stream()
		.max(Comparator.comparing(Integer::valueOf));
		it.ifPresent(n->System.out.println(n));
		
		//Program:2
		System.out.println("Finding min value in a list");
		Optional<Integer> im=lt.stream()
				.sorted()
				.findFirst();
				im.ifPresent(n->System.out.println(n));
				
				Optional<Integer> ig=lt.stream()
				.min(Comparator.comparing(Integer::valueOf));
				ig.ifPresent(n->System.out.println(n));
	}
}
