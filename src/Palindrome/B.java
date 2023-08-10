package Palindrome;

public class B {
	public static void main(String[] args) {
		String s="gadag";
		s=s.toLowerCase();
		s=s.replace(" ", "");
		String s2="";
	
		for (int i = s.length()-1; i >=0; i--) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
		if (s.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	
	}

}
