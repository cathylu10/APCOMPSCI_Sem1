import java.util.Scanner;
public class User
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setAvatar(String av)
	{
		avatar = av;
	}
	
	public String toString()
	{
		return "User Info...\nFirst name: " + firstName + 
								"\nLast name: " + lastName + 
								"\nAvatar: " + avatar + 
								"\nUser ID#: " + userID;
	}
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		String yOrN = kb.next();
		String fN;
		String lN;
		String av;
		
		if(yOrN.equals("n"))
		{
			System.out.println("Please enter your first name: ");
			fN = kb.next();
			System.out.println("Please enter your last name: ");
			lN = kb.next();
			User user1  = new User(fN, lN);
			System.out.println(user1);
		}
		else
		{
			System.out.println("Please enter your first name: ");
			fN = kb.next();
			System.out.println("Please enter your last name: ");
			lN = kb.next();
			System.out.println("Please enter your avatar name: ");
			av = kb.next();
			User user2 = new User(fN, lN, av);
			
			System.out.println(user2);
			
			System.out.println("Please enter your avatar name: ");
			av = kb.next();
			user2.setAvatar(av);
			
			System.out.println(user2);
		}

	}
}