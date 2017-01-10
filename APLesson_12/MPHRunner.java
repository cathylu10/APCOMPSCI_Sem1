import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the number of hours: ");
		int hours = kb.nextInt();
		System.out.println("Please enter the number of minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours = " + object.calculateMPH() + " mph");

		System.out.println("\nPlease enter the distance: ");
		distance = kb.nextInt();
		System.out.println("Please enter the number of hours: ");
		hours = kb.nextInt();
		System.out.println("Please enter the number of minutes: ");
		minutes = kb.nextInt();
		object.setMPH(distance, hours, minutes);
		System.out.println(distance + " miles in " + hours + " hours = " + object.calculateMPH() + " mph");
	}
}