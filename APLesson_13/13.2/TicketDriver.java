public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup wu = new Walkup();
		Advance adv = new Advance(10);
		StudentAdvance sa = new StudentAdvance(5);
		
		System.out.println(wu);
		System.out.println(adv);
		System.out.println(sa);
	}
}