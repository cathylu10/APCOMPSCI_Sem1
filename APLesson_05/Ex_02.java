import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first item: ");
		String item1 =  kb.nextLine();
		System.out.println("Enter the price: ");
		double price1 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter your second item: ");
		String item2 =  kb.nextLine();
		System.out.println("Enter the price: ");
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter your third item: ");
		String item3 =  kb.nextLine();
		System.out.println("Enter the price: ");
		double price3 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter your fourth item: ");
		String item4 =  kb.nextLine();
		System.out.println("Enter the price: ");
		double price4 = kb.nextDouble();
		
		String subtotal = "Subtotal: ";
		double sub = price1 + price2 + price3 + price4;
		String disct = "Discount: ";
		double d = discount(sub);
		double tax = 0.0065*sub;
		String t = "Total: ";
		double total = sub - 0.01*d*sub + tax;
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format(subtotal, sub);
		format(disct, discount(sub));
		format(t, total);
		System.out.println("\n_______________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public static double discount(double s)
	{
		double d = 0;
		
		if(s > 2000)
		{
			d = 15;
		}
		if(s < 2000)
		{
			d = 0;
		}
		
		return d;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n* %10s ...... %8.2f * ", item, price);
	}
}