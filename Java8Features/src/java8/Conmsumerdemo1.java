package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Conmsumerdemo1{// implements Consumerdemo{

	public static void main(String[] args) {
		Consumer c=(t) ->System.out.println(t);				
		c.accept("abcd");
		List l=Arrays.asList(10,15,20,25,30);
		l.forEach((t) ->System.out.println(t));
		//l.forEach(System.out::println);
	}

//	@Override
//	public void accept(Object t) {
//		System.out.println(t);
//		
//	}

}
