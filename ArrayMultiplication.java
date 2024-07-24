package nandini;

public class ArrayMultiplication {
	public static void main(String args[])
	{
		int a[][]= {{1,2,3},{4,5,6}};
		int product=1;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++) {
				System.out.println("i:"+i+"j"+j+(a[i][j]));
				product=product*a[i][j];
				
				
			}
		}System.out.println(product);
	}

}
