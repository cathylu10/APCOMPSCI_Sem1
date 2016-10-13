import java.util.Scanner;
public class Logical
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 10. ");
		int guess = kb.nextInt();
		
		if(guess >= 1 && guess <= 10)
			System.out.println("The number is right!");
		else
			System.out.println("Wrong!");
	}
}