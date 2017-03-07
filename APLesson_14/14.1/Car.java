public abstract class Car implements Location
{
	public Car()
	{
		
	}
	
	public abstract double[] getLoc();
	
	public abstract int getID();
	
	public abstract void move(double one, double two);
}