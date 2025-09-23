package com.java.training.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedTimeZone {

	public static void main(String[] args) {
		ZoneId id=ZoneId.systemDefault();
		System.out.println(id);
		
		//getting all available zones
		Set<String> zones =ZoneId.getAvailableZoneIds();
		for(String zone:zones) {
			ZoneId zoneid=ZoneId.of(zone);//converting string to id
			ZonedDateTime zdate=ZonedDateTime.now(zoneid);
			System.out.println(zdate);
		}

	}

}
