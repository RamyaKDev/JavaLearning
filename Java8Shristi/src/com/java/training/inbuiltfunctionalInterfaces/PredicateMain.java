package com.java.training.inbuiltfunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		Predicate<String> pred=name->name.length()>=3;
		System.out.println(pred.test("abnbhg"));
		
		Predicate<Integer> intpred=num->num%2==0;
		System.out.println(intpred.test(11));
		
		//BiPredicate accepts any type of 2 input parameters
		BiPredicate<String,Integer> strpred=(word,n)->word.charAt(n)=='s';
		System.out.println(strpred.test("scooer",0));
		
		//IntPredicate
		//DoublePredicate
		//Longpredictae
		IntPredicate pint=num->(num*num)>=100;
		System.out.println(pint.test(5));
		
		DoublePredicate pdouble=(n)->Math.random()<=n;
		//random function generates number from 0 to 1
		System.out.println(pdouble.test(0.5));
	}

}
