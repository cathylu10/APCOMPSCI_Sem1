import java.util.Scanner; 

public class BMICalculator
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("BMI Calculator");
	
		System.out.println("How tall are you in inches?");
		Double height = keyboard.nextDouble();
		
		System.out.println("How much do you weight in pounds?");
		Double weight = keyboard.nextDouble();
		
		Double bmi = 703 * weight / (height * height); 
		System.out.println("Your BMI is " + bmi);
	}
}