public class AFigure extends Toy
{
	public AFigure()
	{
		super();
	}
	
	public AFigure(String n)
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
		return "Action Figure";
	}
	
	public String toString()
	{
		return super.toString();
	}
}