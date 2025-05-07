package com.streammap;

import java.util.HashMap;
import java.util.Map;

public class StreamMap1 {

	public static void main(String[] args) {
		Map<String, Integer> hm=Map.of("Apple",1,"Banana",2,"Orange",3,"Avacoda",1000);
		hm.entrySet().stream()
		.filter(entry->entry.getKey().startsWith("A"))
		.forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
	}

}
