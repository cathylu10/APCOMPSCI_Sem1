import java.util.Scanner; 
public class GPAcalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your grade in math: ");
		String math = kb.next();
		System.out.println("Enter your grade in science: ");
		String science = kb.next();
		System.out.println("Enter your grade in English: ");
		String english = kb.next();
		System.out.println("Enter your grade in History: ");
		String history = kb.next();
		System.out.println("Enter your grade in your first elective: ");
		String elective1 = kb.next();
		System.out.println("Enter your grade in your second elective: ");
		String elective2 = kb.next();
		System.out.println("Enter your grade in your third elective: ");
		String elective3 = kb.next();
		
		double grades = calcPoints(math) + calcPoints(science) + calcPoints(english) + calcPoints(history) + calcPoints(elective1) + calcPoints(elective2) + calcPoints(elective3);
	
		double gpa = grades / 7;
		
		System.out.println("Your GPA is " + gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		else
			return 0;
	}
}