package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public interface FunctionDemo {
public static void main(String[] args) {
	Function<String,Integer> fn=(name)->name.length();
	int a=fn.apply("abcdef");
	System.out.println(a);
	
	Function<Collection,Boolean> fn1=(lis)->lis.size()!=0;
	List lis=Arrays.asList(10,20,30,10);
	boolean res=fn1.apply(lis);
	System.out.println(res);
}
}
