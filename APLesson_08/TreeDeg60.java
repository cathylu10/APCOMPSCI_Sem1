import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		int stop = word.length();
		int start = 1;
		
		tree(word, stop, start);
	}
	
	public static String tree(String word, int stop, int start)
	{
		while (start <= stop)
		{
			System.out.printf("%10s\n", word.substring(0, start));
			start += 1;
			return tree(word, stop, start);
		}
		return word;
	}
}