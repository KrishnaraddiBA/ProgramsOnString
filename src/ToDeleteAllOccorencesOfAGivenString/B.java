package ToDeleteAllOccorencesOfAGivenString;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		String s="krishnaraddi";
		int size = s.length();
		int i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character to get deleted");
		String s1=scan.next();
		String res="";
		while (i!=size) {
			if (s.charAt(i)!=s1.charAt(0)) {
				res=res+s.charAt(i);
				
			}
			++i;
			
			
		}
		System.out.println(res);
	}

}
