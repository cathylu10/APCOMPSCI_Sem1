import java.util.Scanner;

public class IDcard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String first =  kb.next();
		System.out.println("Enter your last name: ");
		String last = kb.next();
		System.out.println("Enter your title: ");
		String title = kb.next();
		System.out.println("Enter the school site: ");
		String school = kb.next();
		System.out.println("Enter the school year: ");
		String year = kb.next();
		
	}
}