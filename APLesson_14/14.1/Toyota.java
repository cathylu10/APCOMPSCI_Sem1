import java.util.Arrays;
public class Toyota extends Car
{
	private String loc;
	
	public Toyota()
	{
		loc = "";
	}
	
	public Toyota(String l)
	{
		loc = l;
	}
	
	public int getID()
	{
		return (int)(10000000*Math.random()+1);
	}
	
	public void move(double x, double y)
	{
		String[] locate = loc.split(", ");
		double[] l = new double[2];
		l[0] = Double.parseDouble(locate[0]) + x;
		l[1] = Double.parseDouble(locate[1]) + y;
		loc = "" + l[0] + ", " + l[1];
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		String[] locate = loc.split(", ");
		location[0] = Double.parseDouble(locate[0]);
		location[1] = Double.parseDouble(locate[1]);
		return location;
	}
}