package com.java.training.datetimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
	Month month=datetime.getMonth();
	System.out.println(month);
	
	System.out.println(datetime.getHour());
	System.out.println(datetime.getDayOfMonth());
	
	datetime=datetime.withDayOfYear(6).withYear(2009);
	System.out.println(datetime);
	}

}
