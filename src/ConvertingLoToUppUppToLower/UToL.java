package ConvertingLoToUppUppToLower;

public class UToL {
	public static void main(String[] args) {
		String s="GADAG";
		int size = s.length();
		
		char[] c1=new char[size];
		int i=0;
		while (i!=size) {
			if (s.charAt(i)!=' ') {
				c1[i]=(char) (s.charAt(i)+32);
			}
			++i;
			
		}
		String s2 = String.valueOf(c1);
		System.out.println(s2);
	}

}
