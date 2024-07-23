package nandini;

public class OctaToHexa {
	
	public static void main(String args[])
	{
		String octalNumber="053";
		//convert octal to decimal
		int decimalNumber=Integer.parseInt(octalNumber,8);
		//convert decimal to hexadecimal
		String hexadecimalNumber=Integer.toHexString(decimalNumber).toUpperCase();
		System.out.println("octal number"+octalNumber);
		System.out.println("hexadecimalNumber"+hexadecimalNumber);
	}

}
