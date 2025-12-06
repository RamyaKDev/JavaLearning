package streaminterviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicates {

	public static void main(String[] args) {
		//Print Unique elements
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 5);
		Set<Integer> hs=new HashSet<Integer>();
		List<Integer> list =	numbers.stream()
		.filter(n->hs.add(n))
		.collect(Collectors.toList());
		System.out.println(list);
		
		//print duplicate elements
		Set<Integer> hs1=new HashSet<Integer>();
		List<Integer> list1 =	numbers.stream()
		.filter(n->!hs1.add(n))
		.collect(Collectors.toList());
		System.out.println(list1);
		
		//remove duplicate elements
		List<Integer> list2 =numbers.stream()
		.distinct()
		.collect(Collectors.toList());
		System.out.println(list2);
	}

}
