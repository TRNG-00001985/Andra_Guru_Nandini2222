package nandini;

public class Swap {
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		a=a^b;
		b=a^b;
		
		a=a^b;
		System.out.println("swap a value:"+a);
		System.out.println("swap b value:"+b);
		
	}

}
