import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>");
		
		Receipt form = new Receipt();
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		double subtotal = price1 + price2 + price3;
		double tax = subtotal * 0.075;
		
		System.out.printf("\n\n*%20s: .......  %5.2f", "Subtotal", subtotal);
		System.out.printf("\n*%20s: .......  %5.2f", "Tax", tax);
		System.out.printf("\n*%20s: .......  %5.2f", "Total", subtotal + tax);
		System.out.println("\n_________________________________________");
		System.out.println("* Thank you for your support *");
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*%20s .......  %5.2f", item, price);
	}
}