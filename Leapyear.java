package nandini;

public class Leapyear {
	public static void main(String args[])
	{
		int year=2024;
		if(isLeapYear(year))
		{
			System.out.println(year+"is a leap year");
		}else {
			System.out.println(year + "it is not a leap year");
		}
	}

	public static boolean isLeapYear(int year) {
		
		// TODO Auto-generated method stub
		if(year%4==0)
		{
			if(year%100!=0||year%400==0) {
				return true;
			}
		}return false;
	}

}
