import java.util.Scanner;
public class Average
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		double num1 = kb.nextDouble();
		System.out.println("Enter your second number: ");
		double num2 = kb.nextDouble();
		System.out.println("Enter your third number: ");
		double num3 = kb.nextDouble();
		
		print(num1,num2,num3,average(num1,num2,num3));
	}
	
	public static double average(double n1, double n2, double n3)
	{
		return(n1+n2+n3)/3;
	}
	
	public static void print(double n1, double n2, double n3, double avg)
	{
		System.out.printf("The average of %10.5f, %10.5f, and %10.5f is %10.5f", n1, n2, n3, avg);
	}
}