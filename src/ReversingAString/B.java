package ReversingAString;

public class B {

	public static void main(String[] args) {
		String s="krishnaraddi";
		String s2="";
		
		int size = s.length();
		char[] c1=new char[size];
		for (int i = s.length()-1; i >=0; i--) {
			s2=s2+s.charAt(i);

			
		}
		System.out.println(s2);
		
	}
	


}
