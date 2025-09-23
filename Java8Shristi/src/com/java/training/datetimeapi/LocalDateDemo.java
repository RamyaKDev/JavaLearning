package com.java.training.datetimeapi;

import java.time.LocalDate;

import java.time.Period;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		//getting month alone
		System.out.println(	date.getDayOfMonth());
		
		//converting string to LocalDate
		LocalDate ndate=LocalDate.parse("2024-09-12");
		System.out.println(ndate);
		
		//converting int to LocalDate
		LocalDate odate=LocalDate.of(2023,8,2);
		System.out.println(odate);
		
		Period p=Period.between(ndate, odate);
		System.out.println(p);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		//adding years
		System.out.println(p.plusYears(4));
		
		
	}

}
