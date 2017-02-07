public class Coin extends Money
{
	private String weight; 
	
	public Coin()
	{
		super();
		this.weight = "";
	}
	
	public Coin(String n, String w, double v)
	{
		super(n, v);
		weight = w; 
	}
	
	public String scan()
	{
		return weight;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "g\n" + 
				super.toString();
	}
}