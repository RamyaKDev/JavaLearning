package com.java.training.methodreference;

public class InstanceRefMain {

	public static void main(String[] args) {
		Arith arith=new Arith();
		ICalculator calc=arith:: sum;
		System.out.println(calc.add(5, 2));

	}

}
