package nandini;
import java.util.Scanner;

public class HardCodedLogin {
	static String storedUsername;
	static String storedPassword;
	
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.signup");
			System.out.println("2.login");
			System.out.println("3.exit");
			System.out.println("choose an option");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the user name:");
				storedUsername=sc.nextLine();
				System.out.println("Enter the password");
				storedPassword=sc.nextLine();
				System.out.println("signup succesfully you can login");
				break;
			case 2:
				if(storedUsername==null||storedPassword==null) {
					System.out.println(" No user  found.please sign up");
					break;
				}
				System.out.println("Enter your username:");
				String username=sc.nextLine();
				System.out.println("Enter your password");
				String password=sc.nextLine();
				if(username.equals(storedUsername)&&password.equals(storedPassword)) {
					System.out.println("Login succsful welcome,"+username+"!");
					
				}else
				{
					System.out.println("Incorrect username or password.please try again");
					
				}break;
				case 3:
					System.out.println("Thankyou for logging in");
					sc.close();
					System.exit(0);
					default:
						System.out.println("Invalid choice.Please try Again.");
					
				
			}
		}
	}
	

}


