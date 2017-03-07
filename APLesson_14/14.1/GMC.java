import java.util.Arrays;
public class GMC extends Car
{
	private double x, y; 
	
	public GMC()
	{
		x = y = 0;
	}
	
	public GMC(double xcoor, double ycoor)
	{
		x = xcoor;
		y = ycoor;
	}
	
	public int getID()
	{
		return (int)(10000000 * Math.random()+1);
	}
	
	public void move(double xcoor, double ycoor)
	{
		x += xcoor;
		y += ycoor;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}