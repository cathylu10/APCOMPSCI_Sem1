import java.util.Scanner;

public class CompInterest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		CompInterest payment = new CompInterest();
		
		System.out.println("Enter your interest rate: ");
		double r = kb.nextDouble();
		System.out.println("Enter your principal: ");
		double p = kb.nextDouble();
		System.out.println("Enter the number of times the loan is compounded per year: ");
		double n = kb.nextDouble();
		System.out.println("Enter the life of the loan (in years): ");
		double t = kb.nextDouble();
		
		System.out.printf("Your total monthly payment is $%10.2f", payment.calcLoan(r, p, n, t));
	}
	
	public double calcLoan(double rate, double principal, double number, double time)
	{
		return (principal*(Math.pow(1+rate/number, number*time)))/(time*12);
	}
	
}