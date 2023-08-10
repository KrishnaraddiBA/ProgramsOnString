package ComputeLengthOfString;

public class A {
	public static void main(String[] args) {
		String s="krishnaraddi";
		//we can use inbuilt method also that is s.length();
		s=s.concat("\0");
		char[] c = s.toCharArray();
		int count=0;
//		for (int i = 0; i < c.length; i++) {
//			count++;
//			
//		}
//		for (char d : c) {
//			count++;
//		}
		
		int i=0;
		while (c[i]!='\0') {
			count++;
			++i;
			
		}
		
		System.out.println(count);
	}

}
