package nandini;

public class WordCount {
public static void main(String args[])
{
	String s="core java core java core";
	String []str=s.split(" ");
	for(int i=0;i<str.length;i++)
	{
		int c=1,v=0;
		for(int j=0;j<str.length;j++)
		{
			if(str[i].equals(str[j])&&i<j)
			{
				c++;
			}
			if(str[i].equals(str[j])&&i>j)
			{
				v++;
			}
		}if(c>0&&v==0)
		{
			System.out.println(str[i]+"presents:"+c);
		}
	}
	
}
}
