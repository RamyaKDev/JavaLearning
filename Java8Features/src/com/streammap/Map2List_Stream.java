package com.streammap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Map2List_Stream {

	public static void main(String[] args) {
		Map<String, Integer> hm=Map.of("Apple",1,"Banana",2,"Orange",3,"Avacoda",1000);
		List<String>         ob= hm.entrySet().stream()
		.map(entry->entry.getKey()+" "+entry.getValue())
				.collect(Collectors.toList());
		System.out.println(ob);
	}

}
