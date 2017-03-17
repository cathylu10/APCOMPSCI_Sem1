import java.util.Arrays;
public class Toyota extends Car
{
	
	public Toyota()
	{

	}
	
	public Toyota(String l)
	{
		String[] locate = l.split(", ");
		location[0] = Double.parseDouble(locate[0]);
		location[1] = Double.parseDouble(locate[1]);
	}

}