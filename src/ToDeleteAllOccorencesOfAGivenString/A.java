package ToDeleteAllOccorencesOfAGivenString;

public class A {
	public static void main(String[] args) {
		String s="krishnaraddi";
		char c='a';
		char[] c1 = s.toCharArray();
		
		int size = c1.length;
		char[] c2=new char[size];
		int i=0;
		while(i!=size) {
			if (c1[i]!=c) {
				c2[i]=c1[i];
				
			}
			++i;
		}
		String s2 = String.valueOf(c2);
		System.out.println(s2);
	}

}
