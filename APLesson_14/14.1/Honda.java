import java.util.Arrays;
public class Honda extends Car
{
	private double[] loc;
	
	public Honda()
	{
		loc = new double[2];
	}
	
	public Honda(double[] l)
	{
		loc = new double[2];
		loc = l;
	}
	
	public int getID()
	{
		return (int)(10000000 * Math.random()+1);
	}
	
	public void move(double xcoor, double ycoor)
	{
		loc[0] += xcoor;
		loc[1] += ycoor;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}