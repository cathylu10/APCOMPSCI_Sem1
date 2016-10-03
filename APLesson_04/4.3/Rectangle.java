import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of your rectangle: ");
		double length = kb.nextDouble();
		System.out.println("Enter the width of your rectangle: ");
		double width = kb.nextDouble();
		
		print(calcPerim(length, width));
		
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %10.5f ft around.", perimeter);
	}
}