import java.util.Scanner;

public class CountByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Count by...");
		int interval = kb.nextInt();
		System.out.println("Count up to...");
		int end = kb.nextInt();
		
		for(int i = interval; i <= end; i+=interval)
		{
			System.out.print(i +"\t");
		}
	}
}