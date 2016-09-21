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
		kb.nextLine();
		System.out.println("Enter the school site: ");
		String school = kb.nextLine();
		System.out.println("Enter the school year: ");
		String year = kb.next();
		kb.nextLine();
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		IDcard form = new IDcard();
		
		System.out.println("**********************************************");
		
		form.format(school, year);
		form.format(first, last);
		form.format(title, subject);
		
		System.out.println("\n\n**********************************************");
		
		
	}
	
	public void format(String word1, String word2)
	{
		System.out.printf("\n* %20s  %20s *", word1, word2);
	}
}