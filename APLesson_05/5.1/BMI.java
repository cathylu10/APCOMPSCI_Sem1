import java.util.Scanner;
public class BMI
{
	static double height;
	static double weight;
	static double bmi;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your height in inches: ");
		height = kb.nextDouble();
		System.out.println("Enter your weight in pounds: ");
		weight = kb.nextDouble();
		
		calcBMI();
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("You are " + condition);
		
	}
	
	public static void calcBMI()
	{
		bmi = 703 * weight / (height * height); 
		if(bmi <= 18.5)
			condition = "Underweight";
		else if (bmi <= 24.9)
			condition = "Normal";
		else if (bmi <= 29.9)
			condition =  "Overweight";
		else if (bmi <= 34.9)
			condition = "Obese";
		else if (bmi <= 39.9)
			condition = "Very Obese";
		else 
			condition = "Morbidly Obese";
	}
}