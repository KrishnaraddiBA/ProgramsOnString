package LoopsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//			
//		}	
//		for (int i : a) {
//			System.out.println(i);
//		}
		List<Integer>list =new ArrayList<>();

		
		for (Integer integer : a) {
			list.add(integer);
		}
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
