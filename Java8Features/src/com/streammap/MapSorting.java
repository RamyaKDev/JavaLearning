package com.streammap;

import java.util.Map;

public class MapSorting {

	public static void main(String[] args) {
		Map<String, Integer> hm=Map.of("Apple",1,"Banana",2,"Orange",3,"Avacoda",1000);
		System.out.println("comparingByKey\n");
		hm.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
		System.out.println("comparingByValue\n");
		
		hm.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));

	}

}
