public class AverageNumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("Numbers...");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("The average of the above numbers is... " + average(numbers));
		
	}
	
	public static double average(int[] nums)
	{
		double avg = 0;
		for(int n : nums)
		{
			avg += n;
		}
		return avg/nums.length;
	}
}