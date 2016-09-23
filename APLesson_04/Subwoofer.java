import java.util.Scanner;

public class Subwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Subwoofer vol = new Subwoofer();
		
		System.out.println("Enter the height: ");
		double height = kb.nextInt();
		System.out.println("Enter the length: ");
		double length = kb.nextInt();
		System.out.println("Enter the width: ");
		double width = kb.nextInt();
		
		System.out.printf("The volume of the subwoofer box is %10.3f", vol.calcVol(height, length,  width));
	}
	
	public double calcVol(double h, double l, double w)
	{
		return (h * l * w)/1728;
	}
}