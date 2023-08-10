package CheckStringsAreEmptyOrNot;

public class A {
	public static void main(String[] args) {
		String s="";
		
		int length = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (length==0) {
				
			}
			else {
				System.out.println("String is not emty");
				break;
			}
			
		}
		System.out.println("String is empty");
	}

}
