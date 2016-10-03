import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle: ");
		double radius = kb.nextDouble();
		
		print(radius, calcArea(radius));
	}
	
	public static double calcArea(double r)
	{
		return 3.14*r*r;
	}
	
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radious of %10.5f is %10.5f", r, area);
	}
}