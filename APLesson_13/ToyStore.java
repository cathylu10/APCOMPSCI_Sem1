import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String ts)
	{
		toyList = new ArrayList<Toy>();
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		ArrayList <String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for (int i = 0; i < toys.size(); i+= 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy object = getThatToy(name);
			if(object == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				else
				{
					toyList.add(new AFigure(name));
				}
			}
			else 
			{
				object.setCount(1);
			}
			
		}
	}
	
	public Toy getThatToy(String nm)
	{
		if(toyList.size() > 0)
		{
			for(Toy object : toyList)
			{
				if(object.getName().equals(nm))
				{
					return object;
				}
			}
			return null;
		}
		else
		{
			return null;
		}
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy object: toyList)
		{
			if(max < object.getCount())
			{
				max = object.getCount();
				name = object.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy object : toyList)
		{
			if(object.getType().equals("Car"))
			{
				cars++;
			}
			else
			{
				figures++;
			}
		}
		if(cars > figures)
		{
			return "Cars";
		}
		if (cars < figures)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return "" + toyList;
	}
}