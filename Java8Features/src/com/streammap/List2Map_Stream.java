package com.streammap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2Map_Stream {

	public static void main(String[] args) {
		List names=List.of("Apple","Car","Ball");
	Map<Character,List<String>> m= (Map<Character, List<String>>) names.stream()
		.collect(Collectors.groupingBy(name->((String) name).charAt(0)));
	System.out.println(m);
	}

}
