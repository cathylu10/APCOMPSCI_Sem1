import java.util.Scanner;
public class Cube
{
	public static void main(String[]Args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side of your cube: ");
		double side = kb.nextDouble();
		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double s)
	{
		return s*s*s;
	}
	
	public static void print(double s, double surfarea)
	{
		System.out.printf("The surface area of a cube with %10.5f sides is %10.5f", s, surfarea);
	}
}