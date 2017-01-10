import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the x-value of your first coordinate");
		int x1 = kb.nextInt();
		System.out.println("Please enter the y-value of your first coordinate");
		int y1 = kb.nextInt();
		System.out.println("Please enter the x-value of your second coordinate");
		int x2 = kb.nextInt();
		System.out.println("Please enter the y-value of your second coordinate");
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		System.out.printf("Distance = %.2f", object.getDistance());
		
		System.out.println("\nPlease enter the x-value of your first coordinate");
		x1 = kb.nextInt();
		System.out.println("Please enter the y-value of your first coordinate");
		y1 = kb.nextInt();
		System.out.println("Please enter the x-value of your second coordinate");
		x2 = kb.nextInt();
		System.out.println("Please enter the y-value of your second coordinate");
		y2 = kb.nextInt();
		object.setCoordinate(x1, y1, x2, y2);
		System.out.printf("Distance = %.2f", object.getDistance());
	}
}