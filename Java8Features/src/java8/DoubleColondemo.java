package java8;

import java.util.Arrays;
import java.util.List;

public class DoubleColondemo {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,15,20,25,30);
		//l.forEach(System.out::println);
		DoubleColondemo dcd=new DoubleColondemo();
		//dcd.display(0);
		//l.forEach(dcd::display);
		l.forEach(DoubleColondemo::display);
		
	}
	public static void display(int no) {
		System.out.println(no+100);
	}

}
