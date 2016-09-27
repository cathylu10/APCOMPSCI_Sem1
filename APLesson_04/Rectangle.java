import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb =  new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = kb.nextDouble();
		System.out.println("Enter the width: ");
		w = kb.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = 2*l+2*w;
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %10.5f ft around.", perimeter);
	} 
}