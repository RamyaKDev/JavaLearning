package streaminterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondMinMax {

	public static void main(String[] args) {
		List<Integer> lt=Arrays.asList(10,23,12,35,11);
		//Second minimum
		Optional<Integer> op=lt.stream()
		.sorted()
		.skip(1)
		.findFirst();
		if(op.isPresent())
			System.out.println(op.get());
		
		//second maximum
		Optional<Integer> op1=lt.stream()
		.sorted((a,b)->b-a)
		.skip(1)
		.findFirst();
		if(op1.isPresent())
			System.out.println(op1.get());
	}

}
