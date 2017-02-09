public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(10000000 * Math.random()+1);
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}