import java.util.Random;
public class Ex_01
{

	public static void main(String[]args)
	{
		Random rand = new Random();
		int you = rand.nextInt(6)+1;
		int cpu = rand.nextInt(6)+1;
		
		String winner = rollDice(you, cpu);
		
		System.out.println("You rolled a " + you);
		System.out.println("Computer rolled a " + cpu);
		System.out.println("The winner is " + winner);
	}
	
	public static String rollDice(int y, int c)
	{
		String winner = " ";
		
		if(y > c)
		{
			winner = "you";
		}
		if(y < c)
		{
			winner = "computer";
		}
		
		return winner;
	}
	
	
}