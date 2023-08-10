package ToCountNumberOfWordsInString;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		String s="krishnaraddi B Alagawadi";
		String[] split = s.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		int count=0;
		for (String string : split) {
			count++;
			
		}
		System.out.println(count);
	}
	
	

}
