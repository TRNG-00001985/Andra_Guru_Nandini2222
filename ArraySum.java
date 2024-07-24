package nandini;
import java.util.Scanner;
public class ArraySum {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	int[] arr=new int [size];
	System.out.println("enter the elements of the array");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int num:arr)
	{
      sum+=num;
	}System.out.println("the sum of array is:"+sum);
}
}
