package nandini;

public class Lcmm {


	public static void main(String args[])
	{
		int n1=12;
		int n2=14;
		int lcm=0;
		int max=n1>n2?n1:n2;
		{
		for(int i=max;i<=n1*n2;i++)
		{
			if(i%n1==0&&i%n2==0) {
				lcm=i;
				break;
			}
		}System.out.println(lcm);

	}
	}
}
