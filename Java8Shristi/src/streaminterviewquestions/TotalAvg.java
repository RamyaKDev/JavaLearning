package streaminterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class TotalAvg {

	public static void main(String[] args) {
		List<Integer> lt=Arrays.asList(10,20,30);
		//sum
	Optional<Integer> sum=	lt.stream()
		.reduce((x,y)->x+y);
	sum.ifPresent(System.out::println);
	
	//avg
	OptionalDouble op=lt.stream()
	.mapToInt(n->n.intValue())
	.average();
	System.out.println(op.getAsDouble());

	}

}
