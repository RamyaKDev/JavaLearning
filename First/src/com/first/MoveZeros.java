package com.first;

import java.util.List;
import java.util.stream.Stream;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=List.of(1,-2,0,3,0,-4,2,0);
		List<Integer> res=Stream.concat((num.stream().filter(n->n!=0)), (num.stream().filter(n->n==0))).toList();
		System.out.println(res);
	}

}
