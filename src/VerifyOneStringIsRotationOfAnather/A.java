package VerifyOneStringIsRotationOfAnather;

public class A {
	public static void main(String[] args) {
		String s1="gadag";
		String s2="adagg";
		String s3=s1.concat(s2);
		if (s3.contains(s2)) {
			System.out.println("It is a reverse of a string");
			
		}
		else {
			System.out.println("It is not a reverse of a string");
		}
	}

}
