package VerifyStringContainOnlyInteger;

public class A {

	public static void main(String[] args) {
		String s="1234";
		int size = s.length();
		int i=0;
		while (i!=size) {
			if (s.charAt(i)>=1&&s.charAt(i)<=100) {
				++i;
			}
			else {
				System.out.println("Not a Numbers");
			System.exit(0);
			}
			
		}
		System.out.println("String contain only numbers");
	}
}
