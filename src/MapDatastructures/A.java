package MapDatastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map is a such a datastructure stores the value in the form of key value pair
public class A {
	public static void main(String[] args) {
		String s="krishnaraddi";
		Map<Character, Integer> map= new HashMap<>();
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
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
