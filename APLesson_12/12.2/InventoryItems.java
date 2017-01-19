import java.util.Scanner;
public class InventoryItems
{
	private String itemManufacturer, itemName, itemCategory;
	private int upc, itemPrice;
	
	public InventoryItems()
	{
		itemManufacturer = "";
		itemName = "";
		itemCategory = "";
		upc = 0;
		itemPrice = 0;
	}
	
	public InventoryItems(String iM, String iN)
	{
		itemManufacturer = iM;
		itemName = iN; 
		itemCategory = "N/A";
		itemPrice = 0;
		upc = (int)(Math.random() * 1000000000);
	}
	
	public InventoryItems(String iM, String iN, String iC, int iP)
	{
		itemManufacturer = iM;
		itemName = iN;
		itemCategory = iC;
		itemPrice = iP;
		upc = (int)(Math.random() * 1000000000);
	}
	
	public String toString()
	{
		return "Item info... \nItem Manufacturer: " + itemManufacturer +
								"\nItem Name: " + itemName +
								"\nItem Category: " + itemCategory +
								"\nItem Price: " + itemPrice + 
								"\nUPC# : " + upc;
	}
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Will you be entering category and price information? (y or n)");
		String yOrN = kb.next();
		
		if(yOrN.equals("n"))
		{
			System.out.println("Please enter the item manufacturer: ");
			String manufacturer = kb.next();
			System.out.println("Please enter the item name: ");
			String name = kb.next();
			
			InventoryItems item1 = new InventoryItems(manufacturer, name);
			
			System.out.println(item1);
		}
		else
		{
			System.out.println("Please enter the item manufacturer: ");
			String manufacturer = kb.next();
			System.out.println("Please enter the item name: ");
			String name = kb.next();
			System.out.println("Please enter the item category: ");
			String category = kb.next();
			System.out.println("Please enter the item price");
			int price = kb.nextInt();
			
			InventoryItems item2 = new InventoryItems(manufacturer, name, category, price);
			
			System.out.println(item2);
		}
		
	}
}