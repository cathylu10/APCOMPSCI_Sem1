import java.util.Scanner;

public class DistanceTraveled
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Distance Traveled Calculator");
		System.out.println("What is your acceleration in meters per second squared?");
		Double a = keyboard.nextDouble();
		
		System.out.println("What was your initial velocity in meters per second?");
		Double v = keyboard.nextDouble();
		
		System.out.println("What was your initial starting position in meters from the origin?");
		Double d = keyboard.nextDouble();
		
		System.out.println("How long did you travel for in seconds?");
		Double t = keyboard.nextDouble();
		
		Double dfinal = .5*a*t*t + v*t + d;
		System.out.println("You traveled for a total distance of " + dfinal + " meters.");
	}
}