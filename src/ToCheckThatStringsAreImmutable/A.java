package ToCheckThatStringsAreImmutable;
//To prove that strings are immutable
public class A {
	public static void main(String[] args) {
		String s1="krishnaraddi";
		String s2="alagawadi";
		s1.concat(s2);
		System.out.println(s1);
	}

}
