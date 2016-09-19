public class Lesson04
{
	public static void main(String[]args)
	{
		Lesson04 form = new Lesson04();
	
		String word1 = "blaaah";
		double number1 = 444564.2346;
		form.format(word1, number1);
		
		String word2 = "yessss";
		double number2 = 809528.4931809;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
	
}