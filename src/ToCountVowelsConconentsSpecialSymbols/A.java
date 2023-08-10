package ToCountVowelsConconentsSpecialSymbols;

public class A {
	public static void main(String[] args) {
		String s="krishna@raddi";
		s=s.toLowerCase();
		char[] c = s.toCharArray();
		int size = c.length;
		int i=0;
		int vowels=0;
		int conconent=0;
		int splsym=0;
		while (i!=size) {
			if (c[i]>='a'&&c[i]<='z') {
				if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
					vowels++;
				}
				else  {
					conconent++;
				}	
			}
			else {
				splsym++;
			}
			
			++i;
		}
		System.out.println(vowels);
		System.out.println(conconent);
		System.out.println(splsym);
	}

}
