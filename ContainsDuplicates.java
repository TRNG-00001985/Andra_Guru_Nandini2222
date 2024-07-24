package nandini;

public class ContainsDuplicates {
	public static void main(String args[])
	{
int a[]= {1,2,3,4,5,6,7,8,6,5,2};
System.out.println("Duplicate elements in the given array");
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j])
		{
			System.out.println(a[i]);
		}
	}
}

}
}

