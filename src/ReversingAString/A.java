package ReversingAString;

public class A {
	public static void main(String[] args) {
		String s="krishnaraddi";
		char[] c = s.toCharArray();
		int size = c.length;
		char[] c1=new char[size];
		
		int i=0;
		while (i!=size) {
			if(i!=' ') {
			c1[size-1-i]=c[i];
			}
			++i;
		}
		String s2 = String.valueOf(c1);
		System.out.println(s2);
	}

}
