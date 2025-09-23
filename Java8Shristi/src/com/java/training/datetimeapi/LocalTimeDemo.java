package com.java.training.datetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
	
//				//converting string to LocalTime
//		LocalTime ntime=LocalTime.parse("6:22:22");
//				System.out.println(ntime);
				
				//converting int to LocalTime
				LocalTime otime=LocalTime.of(20,8,2);
				System.out.println(otime);
				
			Duration p=Duration.between(time, otime);
				System.out.println(p);				
				System.out.println(p.getSeconds());
				
				
				//adding years
				System.out.println(p.plusHours(5));

	}

}
