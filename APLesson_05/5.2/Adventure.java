import java.util.Scanner;
public class Adventure
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to..." +
							"\n 1. Go to school" +
							"\n 2. Stay home ");
		int choice1 = kb.nextInt();
		if(choice1 == 1)
		{
			System.out.println("You are at school. " +
								"\n Oh no! You are late!" + 
								"\n Would you like to..." +
								"\n 1. Go to the attendence office" +
								"\n 2. Sneak into class");
			int choice2 = kb.nextInt();
			if(choice2 == 1)
			{
				System.out.println("You have obtained a pass from the attendence office. " +
								"\n When you head to class, you meet the principal in the hallway" + 
								"\n Would you like to..." +
								"\n 1. Run away" +
								"\n 2. Say hi");
				int choice3 = kb.nextInt();	
				if(choice3 == 1)
				{
					System.out.println("The principal used to be on the track team." +
								"\n He quickly catches you and reports your absence to your parents" + 
								"\n Sorry. You lose!" );
				}
				else
				{
					System.out.println("After greeting the principal, you make it to class. " +
								"\n The rest of the school day is a breeze. " + 
								"\n Congrats on surviving a day at school!" );
				}
			}
			else
			{
				System.out.println("While you are sneaking into class, a classmate notices you. " +
								"\n Your classmate goes to report you to the teacher" + 
								"\n Would you like to..." + 
								"\n 1. Hide" +
								"\n 2. Bribe your classmate");
				int choice4 = kb.nextInt();
				if(choice4 == 1)
				{
					System.out.println("The teacher sees you immediately and reports your absence to your parents" + 
								"\n Sorry. You lose!" );
				}
				else
				{
					System.out.println("You hand a stick of gum to your classmate" +
								"\n Your classmate smiles at you and allows you to pass by unnoticed" + 
								"\n The rest of the school day is a breeze." +
								"\n Congrats on surviving a day at school!");
				}
			}
		}
		else
		{
			System.out.println("Since you have decided to stay at home, you now have 6 more hours of free time." +
								"\n Would you like to..." + 
								"\n 1. Eat food" +
								"\n 2. Do AP Comp Sci labs");
			int choice5 = kb.nextInt();
			if(choice5 == 1)
			{
				System.out.println("Because you have lots of time on your hands, you decide to make a fancy meal" + 
								"\n Would you like to..." + 
								"\n 1. Make instant ramen" +
								"\n 2. Eat potato chips");
				int choice6 = kb.nextInt();
				if(choice6 == 1)
				{
					System.out.println("While making ramen, you accidentally burn the house down." +
								"\n Sorry. You lose!");
				}
				else
				{
					System.out.println("The potato chips are very tasty." +
								"\n You are very satisfied and feel like you have had a very fulfilling day. " + 
								"\n Congrats on surviving the day without dying.");
				}
			}
			else
			{
				System.out.println("Since you have procrastinated a lot, there are very many labs to do" +
								"\n Would you like to..." + 
								"\n 1. Cheat" +
								"\n 2. Work on them");
				int choice7 = kb.nextInt();
				if(choice7 == 1)
				{
					System.out.println("Wait. How does one cheat again? " +
								"\n Without any other options, you pull an all-nighter and successfully finish the labs." + 
								"\n Congrats on completeing your assignments");
				}
				else
				{
					System.out.println("You pull an all-nighter and successfully finish all the labs." + 
								"\n Congrats on completeing your assignments");
				}
			}
		}
	}
}