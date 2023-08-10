package CopyingOneStringToAnather;

public class A {
	public static void main(String[] args) {
		String s1="krishnaraddi";
		String s2="";
		char[] c1 = s1.toCharArray();
		int size = c1.length;
		char[] c2 = new char[size];
		int i=0;
		while (i!=size) {
			c2[i]=c1[i];
			++i;
		}
		 s2 = String.valueOf(c2);
		 System.out.println(s2);
	}

}
