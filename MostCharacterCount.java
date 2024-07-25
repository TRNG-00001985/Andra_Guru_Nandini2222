package nandini;

public class MostCharacterCount {
	public static void main(String[] args) {

		String s="madama";

		char ch=0;

		int max=0;

		for(int i=0;i<s.length();i++) {

		int c=0;

		for(int j=0;j<s.length()-1;j++) {

		if (s.charAt(i)==s.charAt(j+1)) {
			c++;
		}

}
if(max<c)
{
	ch=s.charAt(i);
	
}
}
		System.out.println(ch);
	}
}