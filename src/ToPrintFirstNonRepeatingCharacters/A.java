package ToPrintFirstNonRepeatingCharacters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		String s="krishnaraddi";
		Map<Character, Integer> map= new LinkedHashMap<>();
		char[] c = s.toCharArray();
		int size = c.length;
		int i=0;
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
		if (entry.getValue()==1) {
			System.out.println(entry.getKey());
			System.exit(0);
			
		}
		
	}
	}

}
