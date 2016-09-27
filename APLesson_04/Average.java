import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		num1 = kb.nextDouble();
		System.out.println("Enter your second number: ");
		num2 = kb.nextDouble();
		System.out.println("Enter your third number: ");
		num3 = kb.nextDouble();
		
		average();
		print();
	}
	
	public static void average()
	{
		avg = (num1+num2+num3)/3;
	}
	
	public static void print()
	{
		System.out.printf("The average of %10.5f, %10.5f, and %10.5f is %10.5f", num1, num2, num3, avg);
	}
}