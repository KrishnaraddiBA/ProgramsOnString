package ToCheckStringContainsAllUniqueCharactersOrNot;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		String s="kris";
		Map<Character, Integer> map= new LinkedHashMap<>();
		int i=0;
		char[] c = s.toCharArray();
		int size = c.length;
		while (i!=size) {
			if (map.containsKey(c[i])==false) {
				map.put(c[i], 1);
			}
			else {
				Integer oldval = map.get(c[i]);
				int newval=oldval+1;
				map.put(c[i], newval);
			}
			++i;
			
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			i=0;
			if(entry.getValue()==1) {
				++i;
			}
			else {
				System.out.println("It does not contain unique characters please give a differnt words");
				System.exit(0);
			}
			
		}		
		System.out.println("String contain only unique characters");
	}

}
