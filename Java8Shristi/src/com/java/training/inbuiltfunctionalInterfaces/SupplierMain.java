package com.java.training.inbuiltfunctionalInterfaces;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
	Supplier<String> sup=()->"Hello";
	System.out.println(sup.get());

	Supplier<Integer> supint=()->100;
	System.out.println(supint.get());

	IntSupplier sint=()->10;
	System.out.println(sint.getAsInt());
	
	DoubleSupplier sdouble=()->Math.pow(3, 2);
	System.out.println(sdouble.getAsDouble());
	}

}
