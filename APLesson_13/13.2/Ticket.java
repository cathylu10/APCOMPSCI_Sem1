public abstract class Ticket
{
	public Ticket()
	{
		
	}
	
	public int getSerialNo()
	{
		return (int)(100000000 * Math.random()+1);
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() +
				"\nPrice: " + getPrice();
	}
}