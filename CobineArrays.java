package nandini;
import java.util.Arrays;

public class CobineArrays {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		int c[]=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			index++;
		}for(int i=0;i<b.length;i++) {
			c[index]=b[i];
			index++;
			
		}System.out.println(Arrays.toString(c));
	}
	

}
