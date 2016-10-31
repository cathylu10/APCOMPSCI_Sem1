import java.util.Scanner;
public class AverageDigits
{
	static int digits = 0;
	static int sum = 0;
	static double average = 0;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		avDigits(number);
		System.out.println("The average of the digits in " + number + " is " + average);

	}
	public static void avDigits(int number)
	{
		int num = number;
		while(num > 0)
		{
			digits++;
			sum += num % 10;
			average = sum/digits;
			num /= 10;
		}
	}
}
