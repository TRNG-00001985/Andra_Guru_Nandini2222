package nandini;

public class HexaToOcta {
	public static void main(String args[])
	{
		String hexadecimalNumber="07f";
		int decimalNumber=Integer.parseInt(hexadecimalNumber,16);
		String octalNumber=Integer.toOctalString(decimalNumber);
		System.out.println("hexadecimal numbrt"+hexadecimalNumber);
		System.out.println("octalnumber"+octalNumber);
		
	}
}
