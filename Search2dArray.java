package nandini;
import java.util.Scanner;

public class Search2dArray {
	public static void main(String args[])
	{
		int[][] a= {{1,2,3},{4,5,6}};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elemenet you want to search!");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				if(n==a[i][j]) {
					flag=true;
					break;
				}
			}
		}if(flag)
		{
			System.out.println("Elements are present");
		}else
		{
			System.out.println("Elements are not present");
		}
	}

}
