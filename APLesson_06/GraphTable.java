import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = kb.nextInt();
		System.out.println("Enter the size of the table: ");
		int size = kb.nextInt();
		
		System.out.printf("%3s\t%3s\n", "x", "f(x)");
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%3d\t%3d\n", i, i * integer);
		}
	}
}