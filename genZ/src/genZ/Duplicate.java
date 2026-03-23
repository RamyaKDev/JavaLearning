package genZ;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		String s="programmingm";
		char[] chars=s.toCharArray();
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char ch:chars) {
			if(hm.containsKey(ch))
				hm.put(ch,hm.get(ch)+1);
			else
				hm.put(ch, 1);
		}
		int max=0;
		char maxchar=' ';
		for(Map.Entry<Character,Integer> entry: hm.entrySet()) {
			
			if(entry.getValue()>max) {
				max=entry.getValue();
				maxchar=entry.getKey();
			//System.out.println(entry.getKey()+" "+entry.getValue());
				
		}
			
		}
		System.out.println(maxchar+" "+max);
	}

}
