public class GameRunner
{
	public static void main(String[]args)
	{
		XBox xbox1 =  new XBox("XBox");
		System.out.println(xbox1);
		
		PlayStation playstation1 = new PlayStation("PlayStation");
		System.out.println(playstation1);
		
		PC pc1 = new PC ("PC");
		System.out.println(pc1);
	}
}