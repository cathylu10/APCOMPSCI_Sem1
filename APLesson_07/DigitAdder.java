import java.util.Scanner;
public class DigitAdder
{
	static int sum = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = kb.nextInt();
		int num = number;
		sumDigits(number);
		System.out.println("The sumk of the digits in " + number + " is " + sum);
	}
	public static void sumDigits(int num)
	{
		while(num > 0)
		{
			sum = sum + num % 10;
			num /= 10;
		}
	}
}