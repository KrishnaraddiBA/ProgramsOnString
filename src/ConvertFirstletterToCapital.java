
public class ConvertFirstletterToCapital {
	public static void main(String[] args) {
		String s="krishnaraddi b alagawadi";
	char[] c = s.toCharArray();
	int size = c.length;
	int i=0;
	c[0]=(char) (c[0]-32);
	while(i!=size) {
		if (c[i]==' ') {
			c[i+1]=(char) (c[i+1]-32);
		}
		++i;
	}
	String s2 = String.valueOf(c);
	System.out.println(s2);
	}

}
