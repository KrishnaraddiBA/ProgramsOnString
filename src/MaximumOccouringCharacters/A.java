package MaximumOccouringCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		String s="krishnaraddi";
		char[] c = s.toCharArray();
		int size = c.length;
		Map<Character, Integer>map= new HashMap<>();
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
		char maxKey=' ';
		int maxval=0;
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()>maxval) {
				maxKey = entry.getKey();
				 maxval = entry.getValue();
				
				
			}
			
		}
		System.out.println(maxKey+"  "+maxval);
	}

}
