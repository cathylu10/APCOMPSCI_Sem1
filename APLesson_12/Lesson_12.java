public class Lesson_12
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default constructor
	public Lesson_12()
	{
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with params
	public Lesson_12(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
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