package com.streammap;

import java.util.Map;

public class StreamMapUpperCase {

	public static void main(String[] args) {
		Map<String, Integer> hm=Map.of("Apple",1,"Banana",2,"Orange",3,"Avacoda",1000);
		hm.entrySet().stream()
		.map(entry->Map.entry(entry.getKey().toUpperCase(),entry.getValue() ))
		.forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));

	}

}
