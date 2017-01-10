public class UserNamesRunner
{
	public static void main(String[]args)
	{
		Lesson_12 object = new Lesson_12("Cathy", "Cathy", "Lu");
		
		System.out.println("<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		
		Lesson_12 object1 = new Lesson_12();
		
		System.out.println("<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>");
		System.out.println("Name: " + object1.getFirstName() + " " + object1.getLastName());
		System.out.println("User Name: " + object1.getUserName());
		
		object.setUserName("CCathy");
		System.out.println("<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}