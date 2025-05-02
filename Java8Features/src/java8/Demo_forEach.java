package java8;

import java.util.ArrayList;

public class Demo_forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(20);
		al.add(5);
		al.add(6);
		al.add(50);
		//al.forEach((num)->System.out.println(num));
		al.forEach(System.out::println);//Double Colon Operator
	}

}
