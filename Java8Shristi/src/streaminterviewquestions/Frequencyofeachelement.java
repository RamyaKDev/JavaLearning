package streaminterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequencyofeachelement {

	public static void main(String[] args) {
		
List<Integer> numbers=Arrays.asList(12,1,3,2,1,12);
Map<Integer,Long> m =numbers.stream()
.collect(Collectors.groupingBy(n->n,Collectors.counting()));
m.forEach((key,value)->System.out.println(key+" "+value));
	}

}
