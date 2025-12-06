package streaminterviewquestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyChar {

	public static void main(String[] args) {
		String s="programming";
		Map<Character,Integer> hm=new LinkedHashMap<>();
		char[] ch=s.toCharArray();
		for(char in:ch) {
			if(hm.containsKey(in))
				hm.put(in,hm.get(in)+1 );
			else
				hm.put(in,1 );
		}
		for(Entry<Character,Integer> count :hm.entrySet())
			//System.out.println(count.getKey() +" "+count.getValue());
			if(count.getValue()>1)
				System.out.println(count.getKey() +" "+count.getValue());
	}

}
