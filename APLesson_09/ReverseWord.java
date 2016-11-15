import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 5 words: ");
		String[] words = new String[5];
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("In order...");
		for(String w : words)
		{
			System.out.println(w);
		}
	
		System.out.println();
		System.out.println("Reversed...");
		reverse(words);
	}
	
	public static void reverse(String[] w)
	{
		for(int i = w.length-1; i >= 0; i--)
		{
			System.out.println(w[i]);
		}
	}
}