package MapDatastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//totally there are three type sof map they are hashmap,linkedHashmap,LinkedHashmap
//hashmap does not retain order of insertion 
//linkedHashmap retain order of insertion
//Treemap arranges in an assending order
public class DiffrentTypesOfMaps {
	public static void main(String[] args) {
		String s="krishnaraddi";
		char[] c = s.toCharArray();
		int size = c.length;
//		Map<Character, Integer> map= new HashMap<>();
//		Map<Character, Integer> map=new LinkedHashMap<>();
		Map<Character, Integer> map=new TreeMap<>();
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
