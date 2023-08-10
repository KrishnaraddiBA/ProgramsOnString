package Anagram;

import java.util.Arrays;

public class A {
	
	public static void main(String[] args) {
		String s="aradhya";
		String s2="hradaya";
		char[] c = s.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c);
	Arrays.sort(c2);
	boolean equals = Arrays.equals(c, c2);
	if (equals==true) {
		System.out.println("these are anagrams");
	}
	else {
		System.out.println("These are not anagrams");
	}
	}
	
	

}
