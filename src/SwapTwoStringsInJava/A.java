package SwapTwoStringsInJava;

public class A {
	public static void main(String[] args) {
		String s1="krishna";
		String s2="alagawadi";
		String temp="";
		System.out.println("Before swapping s1= "+s1);
		System.out.println("Before swapping s2= "+s2);
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After Swapping  s1= "+s1);
		System.out.println("After Swapping  s2= "+s2);
	}

}
