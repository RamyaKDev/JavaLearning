package streaminterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumberfromList {

	public static void main(String[] args) {
		//Find missing number from given sorted list
		List<Integer> sortedList = Arrays.asList(1, 2, 4, 5, 6); // Missing 3
		int start=sortedList.get(0);
		int end=sortedList.get(sortedList.size()-1);
		IntStream.rangeClosed(start, end)
		.boxed()
		.filter(n->!sortedList.contains(n))
		.forEach(System.out::println);
		
	}

}
