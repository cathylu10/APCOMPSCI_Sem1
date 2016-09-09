import java.util.Scanner ;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.\nI'd like to ask you a few questions.");
		
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + "?!!! Why would anyone name a baby that?");
		
		System.out.println("How old are you, " + name + "?");
		int age = keyboard.nextInt();
		System.out.println("Ooooo!!! " + age + " is getting up there.");
		
		keyboard.nextLine();
		
		System.out.println("What do you do for fun, " + name + "?");
		String hobby = keyboard.nextLine();
		System.out.println("I thought only nerds like to " + hobby + "?");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.nextLine();
		System.out.println("Booo!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + "? Wow, i hope the rest of your family is better looking.");
		
		keyboard.nextLine();
		
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.nextLine();
		System.out.println("I think you'd have to be smarter to be a " + job + ".");
		
		System.out.println("So " + name + ", you're " + age + "...");
		System.out.println("You like to " + hobby + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + job + ".");
		System.out.println("I'm only kidding " + name + ".");
	}
}