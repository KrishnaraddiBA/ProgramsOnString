package Panagram;

public class A {
	public static void main(String[] args) {
		String s="the quick brawn fox jumps over a lazy dog";
		s=s.replace(" ", "");
		s=s.toUpperCase();
		int j='A';
		System.out.println(j);
		
		int []a= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int size = s.length();
		int i=0;
		while (i!=size) {
			int index=s.charAt(i)-65;
			a[index]=1;
			++i;
			
		}
		i=0;
		while(i!=a.length) {
			if (a[i]==1) {

				++i;
			}
			else {
				System.out.println("not a panagram");
			System.exit(0);
			}
			
		}
		System.out.println("It is Panagram");
		
	}

}
