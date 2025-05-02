package java8;
import java.util.ArrayList;
import java.util.function.Predicate;
public interface PredicateDemo {
	
public static void main(String[] args) {
	
	Predicate<Integer> p=(a)-> a>0;
	boolean res=p.test(5);
	System.out.println(res);
	
	Predicate<String> p1=(name)-> name.length()==0;
	//boolean res1=p1.test("abcd");
	boolean res1=p1.negate().test("pqr");
	System.out.println(res1);
	
	//and() or() negate()
	Predicate<Integer> p2=(no)-> no%2==0;
	Predicate<Integer> p3=(no1)-> no1>10;
	//boolean res2=p2.and(p3).test(2);
	boolean res2=p2.or(p3).test(2);
	System.out.println(res2);
	
	//passing predicate as argument
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(100);
	al.add(20);
	al.add(5);
	al.add(6);
	al.add(50);
	display(al,p2.and(p3));
}

public static void display(ArrayList<Integer> al, Predicate<Integer> p) {
	for(Integer no:al) {
		if(p.negate().test(no)) {
			System.out.println(no);
		}
	}
	
}
}
