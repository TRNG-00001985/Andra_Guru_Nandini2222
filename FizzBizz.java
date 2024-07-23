package nandini;

public class FizzBizz {
public static void main(String args[])
{
	int a=9;
	if(a%3==0&&a%5==0)
	{
		System.out.println("this is a fizzbizz number");
	}
	else if(a%3==0)
	{
		System.out.println("this is a fizz number");
		
	}else
	{
		System.out.println("this is a bizz number");
	}
}
}
