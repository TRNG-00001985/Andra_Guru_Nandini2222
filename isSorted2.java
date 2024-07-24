package nandini;

public class isSorted2 {
	
public static void main(String args[])
{
int a[]={1,2,7,4,5};

boolean flag=true;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++) {
		if(a[i]<a[j])
		{
			continue;
			
		}
		else {
			flag=false;
			break;
		}
	}
}
if(flag)
{
	System.out.println("sorted");
}else {
	System.out.println("not sorted");
}
}
}

