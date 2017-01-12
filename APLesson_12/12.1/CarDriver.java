import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the paint color: ");
		String pnt = kb.nextLine();
		System.out.println("Please enter the interior type: ");
		String inter = kb.nextLine();
		System.out.println("Please enter the engine type: ");
		String eng = kb.nextLine();
		System.out.println("Please enter the tire type: ");
		String tire = kb.nextLine();
		
		Car car1 = new Car (pnt, inter, eng, tire);
		
		System.out.println("Your vehicle is ready.........");
		System.out.println("Paint: \t" + car1.getPaint());
		System.out.println("Interior: \t" + car1.getInterior());
		System.out.println("Engine: \t" + car1.getEngine());
		System.out.println("Tires: \t" + car1.getTires());
	}
}