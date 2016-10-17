import java.util.Scanner;
public class Password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String username = "username";
		String password = "password";
		
		passCheck(username, password);
	}
	
	public static void passCheck(String username, String password)
	{
		System.out.println("Enter your username: ");
		String inputUsername = kb.next();
		System.out.println("Enter your password: ");
		String inputPassword = kb.next();
		
		if (username.equals(inputUsername) && password.equals(inputPassword))
		{
			System.out.println("You are granted access!");
		}
		else if (username.equals(inputUsername))
		{
			System.out.println("Your password is incorrect!");
		}
		else if (password.equals(inputPassword))
		{
			System.out.println("Your username is incorrect!");
		}
		else
		{
			System.out.println("Your username and password are incorrect!");
		}
	}
}
