package com.streammap;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamtoMap {

	public static void main(String[] args) {
		Map<String, Integer> hm=Map.of("Apple",1,"Banana",2,"Orange",3,"Avacoda",1000);
		Map<String, Integer> op =hm.entrySet().stream()
		.filter(entry->(Integer)(entry.getValue())==1000)
		.collect(Collectors.toMap(entry->entry.getKey(),entry-> entry.getValue()));
		
		System.out.println(op);
	}

}
