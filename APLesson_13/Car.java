public class Car extends Toy
{
	public Car()
	{
		super();
	}
	
	public Car(String n)
	{
		super(n);
	}
	
	public void setName(String n)
	{
		super.setName(n);
	}
	
	public void setCount(int c)
	{
		super.setCount(c);
	}
	
	public String getName()
	{
		return super.getName();
	}
	
	public int getCount()
	{
		return super.getCount();
	}
	
	public String getType()
	{
		return "Car";
	}
	
	public String toString()
	{
		return super.toString();
	}
}