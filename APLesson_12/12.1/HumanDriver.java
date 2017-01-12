import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your hair color: ");
		String hair =  kb.next();
		System.out.println("Please enter your eye color: ");
		String eyes = kb.next();
		System.out.println("Please enter your skin color: ");
		String skin = kb.next();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info.......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		System.out.println("Please enter a friend's hair color: ");
		hair =  kb.next();
		System.out.println("Please enter a friend's eye color: ");
		eyes = kb.next();
		System.out.println("Please enter a friend's skin color: ");
		skin = kb.next();
		
		object.setHES(hair, eyes, skin);
		System.out.println("Friend's info.......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
	}
}