public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore inventory = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(inventory);
		
		System.out.println("The most frequent toy is ..." + inventory.getMostFrequentToy());
		System.out.println("The most frequent type of toy is ..." + inventory.getMostFrequentType());
	}
}