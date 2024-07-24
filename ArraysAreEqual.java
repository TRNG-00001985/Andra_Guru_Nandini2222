package nandini;

public class ArraysAreEqual {
	public static void main(String args[])
	{
	int[] a= {1,2,3,4,5};
	int[] b= {1,2,3,4,5,7,6};
	if(a.length==b.length) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
		}if(c==a.length)
		
     {
		System.out.println("Array are equal");
	 }
		else {
			System.out.println("Arrays are not equal");
		}
	}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
	
}
}
