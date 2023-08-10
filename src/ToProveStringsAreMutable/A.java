package ToProveStringsAreMutable;

public class A {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("krishnaraddi");
		StringBuffer s2=new StringBuffer("alagawadi");
		s1.append(s2);
		System.out.println(s1);
	}

}
