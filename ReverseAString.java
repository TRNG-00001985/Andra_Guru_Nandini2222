package nandini;

public class ReverseAString {
	public static void main(String args[]) {
		String s="java";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reversed string "+rev);
		
	}

	
}
