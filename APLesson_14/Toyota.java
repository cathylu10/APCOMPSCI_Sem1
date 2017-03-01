import java.util.Arrays;
public class Toyota implements Location
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
	
	public void move(String l)
	{
		loc = l;
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