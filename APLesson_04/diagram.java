import java.util.Scanner;
public class diagram
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the width of your rectangle: ");
		int width = kb.nextInt();
		System.out.println("Enter the length of your rectangle: ");
		int length = kb.nextInt();
		
		System.out.println("Your perimeter is " + calcPerim(width, length) + "ft.");
	}
	
	public static int calcPerim(int w, int l)
	{
		return 2*(w+l);
	}
}