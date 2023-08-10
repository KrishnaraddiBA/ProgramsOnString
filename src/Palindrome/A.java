package Palindrome;

public class A {

	public static void main(String[] args) {
		String s="radar";
		s=s.toLowerCase();
		s=s.replace(" ", "");
		char[] c = s.toCharArray();
		int size = c.length;
		char[]c1=new char[size];
		int i=0;
		
		while (i!=size) {
			if (c[i]!=' ') {
				c1[size-1-i]=c[i];
			}
			++i;
		}
		String s2 = String.valueOf(c1);
		
		if (s2.equals(s)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	}
}
